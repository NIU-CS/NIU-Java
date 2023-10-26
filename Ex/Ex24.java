import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(system.in);
        int a, b;
        System.out.print("輸入第一個整數:");
        a = keyin.nextInt();
        System.out.print("輸入第二個整數:");
        b = keyin.nextInt();
        while (true)
        {
            System.out.print(a + " +" + b + "=");
            answer = keyin.nextInt();
            if (answer == a + b)
            {
                System.out.println("答對了!");
                break;
            }
            else
                System.out.println("答錯了!");
        }
        keyin.close();
    }
}