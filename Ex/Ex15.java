import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
            int power_degree;
            double bill;
            System.out.print("輸入用電度數(>=0):");
            power_degree = keyin.nextInt();
            switch((power_degree-1)/100)
            {
                case 0 : //0  -100  度
                case 1 : //101-200  度
                    bill = power_degree*3.2;
                    break;
                default: //301度以上
                    bill = 200*3.2+100*3.4+(power_degree-300)*3.6;
            }
        System.out.printf("電費=%.0f元\n", bill);
        keyin.close();

    }


}