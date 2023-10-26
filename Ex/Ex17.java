import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        int num;
        System.out.print("輸入一個正整數:");
        num = keyin.nextInt();
        if (num % 3 == 0)
        {
            if (num % 7 == 0)
            {
                System.put.println(num + "為21的倍數");
            }
            else
            {
                System.out.println(num + "為3的倍數");
            }
        }
        else
        {
            if (num % 7 == 0)
        }

    }

}