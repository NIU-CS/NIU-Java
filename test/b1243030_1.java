public class b1243030_1 {
    public static void main(String args[]) {
        for (int i=1; i<=200; i++) {
            if (!(i%4 == 0 && i%8 != 0)) {
                continue;
            }

            System.out.println(i);
        }
    }
}