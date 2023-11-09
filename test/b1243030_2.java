import java.util.Scanner;

public class b1243030_2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int glass_ball = 50;
        boolean game_status = true;
        int take;
        while (glass_ball > 0) {
            if (game_status) {
                System.out.print("A: ");
            } else {
                System.out.print("B: ");
            }

            take = in.nextInt();
            if (take != 1 && take != 2 && take != 3) {
                System.out.print("please select from 1~3.");
                continue;
            }

            glass_ball -= take;
            System.out.println("there are " + glass_ball + " balls left.");
            game_status = !game_status;
        }

        System.out.print("The winner is ");
        if (game_status) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}