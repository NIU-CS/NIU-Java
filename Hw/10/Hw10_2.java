import java.util.Scanner;

public class Hw10_2 {
    public static int C(int m, int n) {
        if (m < n) return 0;
        else if (n == 0) return 1;
        else if (m == n) return 1;
        else if (n == 1) return m;
        else return C(m - 1, n) + C(m - 1, n - 1);
    }

    public static void main(String[] args) {
        /*
        寫一個程式，運用遞迴觀念，輸入兩個整數 m(>=0) 及 n(>=0)，輸出組合 C(m , n) 之值，求 C(m , n) 的公式如下：
        若m < n  ，則 C(m , n) = 0
        若n = 0           ，則 C(m , n) = 1
        若m = n  ，則 C(m , n) = 1
        若n = 1 ，則 C(m , n) = m
        若m > n         ，則 C(m , n) = C(m-1 , n) + C(m-1 , n-1)
        */

        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.println(C(m, n));
    }
}
