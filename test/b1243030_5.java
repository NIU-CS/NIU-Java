import java.util.Scanner;

public class b1243030_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int money = in.nextInt();
        int coin = 0;
        while (money > 0) {
            if (money >= 20) {
                money -= 20;
                coin++;
            } else if (money >= 5) {
                money -= 5;
                coin++;
            } else if (money >= 1) {
                money -= 1;
                coin++;
            }
        }

        System.out.print(coin);
    }
}