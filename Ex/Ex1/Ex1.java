import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int score;
		System.out.print("input test score:");
		score = keyin.nextInt();
		if (score >= 95) {
			System.out.println("go watch movie");
		}

		keyin.close();
	}
}
