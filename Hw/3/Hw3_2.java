import java.util.Scanner;

public class Hw3_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        money = (money/10000)*1000;

        System.out.println(money);
        in.close();
    }
}
