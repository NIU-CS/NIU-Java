import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = Math.sqrt(a);
        if (b == (int)b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        in.close();
    }
}
