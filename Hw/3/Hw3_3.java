import java.util.Scanner;

public class Hw3_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int weight = in.nextInt();
        System.out.println(weight / Math.pow(height/100.0, 2));
    }
}
