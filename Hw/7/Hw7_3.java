import java.util.Scanner;

public class Hw7_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("請輸入一個6位數正整數: ");
        int num = in.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = num % 10;
            num /= 10;
        }

        boolean isPalindrome = true;
        for (int i = 0; i < 3; i++) {
            if (arr[i] != arr[5 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("是回文數");
        } else {
            System.out.println("不是回文數");
        }
    }
}
