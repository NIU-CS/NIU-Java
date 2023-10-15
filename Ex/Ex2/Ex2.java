import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double money = 400;
		int vip, people;
		System.out.print("card? 1/0:");
		vip = keyin.nextInt();
		System.out.print("shopping people amount:");
		people = keyin.nextInt();
		money = 400 * people;
		if (vip == 1) {
			money *= 0.9;
		}

		System.out.printf("cost: %.0f\n" ,money);
		keyin.close();
	}
}
