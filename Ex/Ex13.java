import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        int score;
        System.out.print("輸入成績:");
        score = keyin.nextInt();
        switch (score/10)
        {
            case 10:
            case 9:
            System.out.println("等級:A");
            break;

            case 8:
            System.out.println("等級:B");
            break;

            case 7:
            System.out.println("等級:C");
            break;

            case 6:
            System.out.println("等級:D");
            break;

            default:
            System.out.println("等級:F");
            break;
        }

    }

}