import java.util.Scanner;

public class Hw5_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            int password = in.nextInt();
            if (password == 123) {
                System.out.println("歡迎光臨本系統!");
                break;
            } else {
                System.out.println("密碼輸入錯誤");
                count++;
            }
        }
    }
}
