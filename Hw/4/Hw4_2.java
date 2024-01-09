import java.util.Scanner;

public class Hw4_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(a+b>c && a+c>b && b+c>a);
        in.close();
    }
}
