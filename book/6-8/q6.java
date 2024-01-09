import java.util.Scanner;

public class q6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String line = in.nextLine();
        boolean isWord = false;
        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i) == ' ') {
                isWord = false;
            } else {
                if (!isWord) count++;
                isWord = true;
            }
        }

        System.out.println(count);
        in.close();
    }
}
