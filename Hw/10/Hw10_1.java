import java.util.Scanner;

public class Hw10_1 {
    public static int calulate(int a, int b, int c) {
        // ax2+bx+c=0
        int x1 = 0, x2 = 0;
        int d = b * b - 4 * a * c;
        if (d < 0) return 0;
        else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("x1 = x2 = " + x1);
            return 1;
        } else {
            x1 = (-b + (int)Math.sqrt(d)) / (2 * a);
            x2 = (-b - (int)Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        System.out.print("c = ");
        c = in.nextInt();
        calulate(a, b, c);
    }
}
