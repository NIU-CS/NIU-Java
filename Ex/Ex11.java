import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int score;
		System.out.print("小明考試的成績");
		score = keyin.nextInt();
		if (score >= 95)
		{
			System.out.println("父母帶他去看電影");
		}
		else
		{
			System.out.println("父母帶他去看電X");
		}
		keyin.close();
		
		
		
		
	}
}