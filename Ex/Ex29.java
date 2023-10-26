import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(system.in);
        int i, password;
        for (i = 1; i <= 3; i++)
        {
            System.out.print("輸入密碼:");
            password = keyin.nextInt();
            if (password == 94879487)
            {
                System.out.println("密碼正確.");
                break;
            }
            else
                System.out.println("密碼錯誤.");
        }
        keyin.close();
    }
}