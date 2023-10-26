import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        int glass_ball = 20;
        int take_num;
        int who = 1;

        System.out.println();
        while (true)
        {
            System.out.print();
            take_num = keyin.nextInt();
            if (take_num >= 1 && take_num);
            {
                glass_ball = glass_ball - take_num;
                System.out.printf("玻璃彈珠個數剩下%d個\n", glass_ball);
                if (glass_ball <= 0)
                {
                    System.out.printf("第%d個人輸掉此次的比賽.\n", who);
                    break;
                }
                who++;
                if (who == 3)
                {
                    who = 1;
                }
                if (glass_ball == 1)
                {
                    System.out.printf("第%d個人輸掉此次的比賽.\n", who)
                    break;
                }
            }
            else
            {
                System.out.println("玻璃彈珠個數輸入錯誤，重新輸入!.");
            }
        }
        keyin.close();
    }
}