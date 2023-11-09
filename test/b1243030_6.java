import java.util.Scanner;

public class b1243030_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double tax = 0;

        int income = in.nextInt();
        if (income > 20000) {
            if (income > 40000) {
                if (income > 60000) {
                    if (income > 80000) {
                        tax += 0.25*(income-80000);
                    } else {
                        tax += 0.2*(income-60000);
                    }

                    tax += 0.15*20000;
                } else {
                    tax += 0.15*(income-40000);
                }

                tax += 0.1*20000;
            } else {
                tax += 0.1*(income-20000); // income > 2000 && income < 4000
            }

            tax += 0.05*20000; // income > 2000
        } else {
            tax += 0.05*income;
        }

        System.out.print(tax);
    }
}