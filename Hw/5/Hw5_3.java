import java.util.Scanner;

public class Hw5_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int length = 1000;
        int count = 0;
        while (length >= 5) {
            length /= 2;
            count++;
        }

        System.out.println(count);
    }
}
