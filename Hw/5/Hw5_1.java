import java.util.Scanner;

public class Hw5_1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i=1; i<=2*n-1; i+=2) {
            sum += i;
        }

        System.out.println(sum);
        in.close();
    }
}
