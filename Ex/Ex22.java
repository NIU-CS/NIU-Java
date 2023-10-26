import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        int i, n;
        int money, totalmoney = 0;
        System.out.print("輸入您購買商品之個數(n>=1):");
        n = keyin.nextInt();
        for (i = 1;i <= n; i++){
            System.out.printf("輸入%d種商品價錢:", i);
            money = keyin.nextInt();
            totalmoney = totalmoney + money;
        }
        System.out.println("全部商品的總金額:" + totalmoney);
        keyin.close();

    }
}