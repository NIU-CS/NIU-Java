import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        int n, i = 1;
        float hieght = 100, distance = 0;
        System.out.print("輸入落第次數:");
        n = keyin.nextInt();
        while (i <= n)
        {
            distance = distance + height;
            height = height / 2;
            distance = distance + height;
            i++;
        }
        distance = distance - height;
        System.out.printf("第%d次球落地時，球經過的距離=%.1f米\n", n, distance);
        System.out.printf("球第%d次反彈的高度=%.1f米", n, height);
        keyin.close();
    }
}