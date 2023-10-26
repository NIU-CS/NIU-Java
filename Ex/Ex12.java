import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args){
		Scanner keyin = new Scanner(System.in);
		double money = 400;
		int vip, people;
		System.out.print("持貴賓卡?(1:持 2:無):");
		vip = keyin.nextInt();
		System.out.print("消費人數");
		people = keyin.nextInt();
		money = 400 * people;
		if (vip == 1){
		money = money * 0.9;
		
		
		
		}
	}
}