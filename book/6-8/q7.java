import java.util.Scanner;

public class q7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // output the number of days in a month
        int ym = in.nextInt();
        int month = ym % 100;
        int year = ym / 100;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            // leap year
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                System.out.println("31");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30");
            } else if (month == 2) {
                System.out.println("29");
            } else {
                System.out.println("Invalid");
            }
        } else {
            // not leap year
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                System.out.println("31");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30");
            } else if (month == 2) {
                System.out.println("28");
            } else {
                System.out.println("Invalid");
            }
        }

        in.close();
    }
}
