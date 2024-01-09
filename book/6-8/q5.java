import java.util.Scanner;

public class q5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 19) {
                System.out.println("魔羯");
            } else if (day >= 20 && day <= 31) {
                System.out.println("水瓶");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 18) {
                System.out.println("水瓶");
            } else if (day >= 19 && day <= 29) {
                System.out.println("雙魚");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.println("雙魚");
            } else if (day >= 21 && day <= 31) {
                System.out.println("牡羊");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 19) {
                System.out.println("牡羊");
            } else if (day >= 20 && day <= 30) {
                System.out.println("金牛");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 20) {
                System.out.println("金牛");
            } else if (day >= 21 && day <= 31) {
                System.out.println("雙子");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 21) {
                System.out.println("雙子");
            } else if (day >= 22 && day <= 30) {
                System.out.println("巨蟹");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                System.out.println("巨蟹");
            } else if (day >= 23 && day <= 31) {
                System.out.println("獅子");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.println("獅子");
            } else if (day >= 23 && day <= 31) {
                System.out.println("處女");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.println("處女");
            } else if (day >= 23 && day <= 30) {
                System.out.println("天秤");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 23) {
                System.out.println("天秤");
            } else if (day >= 24 && day <= 31) {
                System.out.println("天蠍");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 22) {
                System.out.println("天蠍");
            } else if (day >= 23 && day <= 30) {
                System.out.println("射手");
            } else {
                System.out.println("Invalid");
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.println("射手");
            } else if (day >= 22 && day <= 31) {
                System.out.println("魔羯");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

        in.close();
    }
}
