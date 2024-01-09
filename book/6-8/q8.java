import java.util.Scanner;

public class q8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double money = in.nextDouble();
        double year_rate = in.nextDouble();
        int year = in.nextInt();
        double total = money * Math.pow(1 + year_rate, year);

        System.out.println(total);
        in.close();
    }
}
