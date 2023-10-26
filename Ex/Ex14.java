import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        int score;
        System.out.print("輸入成績:");
        score = keyin.nextInt();
        
        if (score>=90)
        {
            System.out.println("等級:A");
        }
        
        
        else if (score>=80)
        {
            System.out.println("等級:B");
        }
        
        
        else if (score>=70)
        {
            System.out.println("等級:C");
        }
        
       
        else if (score>=60)   
        {
            System.out.println("等級:D");
        }
       
        
        else
        {
            System.out.println("等級:F");
        }
            
    }

}