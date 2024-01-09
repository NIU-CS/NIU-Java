import java.util.Scanner;

public class Hw5_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("100元: " + n/100);
        System.out.println("10元: " + (n%100)/10);
        System.out.println("1元: " + (n%100)%10);
        in.close();
    }
}
