import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(system.in);
        int num, total = 0;
        System.out.println("連續將整數一個一個輸入，直到輸入0才表示結束輸入:");
        while (true)
        {
            num = keyin.nextInt();
            if (num == 0)
            {
                break;
            }
             total = total + num;
        }
        System.out.println("總和=" + total);
        keyin.close();
    }
}