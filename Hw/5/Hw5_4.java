import java.util.Scanner;

public class Hw5_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("萬位數: " + n/10000);
        System.out.println("千位數: " + (n%10000)/1000);
        System.out.println("百位數: " + (n%1000)/100);
        System.out.println("十位數: " + (n%100)/10);
        System.out.println("個位數: " + (n%10));
    }
}
