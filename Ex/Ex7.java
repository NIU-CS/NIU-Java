import java.util.Scanner;

public class Ex7{
	public static void main(String[] args) {
		double sum = 0.0;
		System.out.println();
		
		Scanner keyin1 = new Scanner(System.in);
		String str = keyin1.nextLine();
		Scanner keyin2 = new Scanner(str);
		while (keyin2.hasNext()) {
			if (keyin2.hasNextByte())
				sum += keyin2.nextByte();
			else if (keyin2.hasNextShort())
				sum += keyin2.nextShort();
			else if (keyin2.hasNextInt())
				sum += keyin2.nextInt();
			else if (keyin2.hasNextLong())
				sum += keyin2.nextLong();
		}
		
	}
}