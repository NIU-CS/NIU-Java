import java.util.Scanner;

public class b1243030_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int total = 0;

        while (amount > 0) {
            total += amount%10;
            amount /= 10;
        }

        System.out.print(total);
    }
}