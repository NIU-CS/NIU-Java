import java.util.Scanner;

public class b1243030_8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();

        for (int i=0; i<5; i++) {
            System.out.println(amount%10);
            amount /= 10;
        }
    }
}