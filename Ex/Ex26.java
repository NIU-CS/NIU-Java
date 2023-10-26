import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(system.in);
        int money, choose;
        System.out.print("輸入投入的金額:");
        while (true)
        {
            System.out.print("選擇飲料 1.可樂(15元) 2.汽水(12元) 3.結束:");
            choose = keyin.nextInt();
            if (choose == 1)
            {
                if (money < 15)
                    System.out.println("金額不夠買可樂.");
                else
                    money = money - 15;
            }
            else if (choose == 2)
            {
                if (money < 12)
                    System.out.println("金額不夠買汽水.");
                else
                    money = money - 12;
            }
        }
        while (choose != 3);
        System.out.printf("金額剩餘%d元\n", money);
        keyin.close();
    }
}