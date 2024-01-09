public class q3 {
    public static void main(String args[]) {
        for (int i = 1; i < 6; i++) {
            int a = Math.min(6 - i, i);
            for (int j = 1; j < 6; j++) {
                if (j < a || j > 6 - a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println();

        // 1x1 ~ 9x9
        for (int i = 1; i < 10; i++) {
            int a = Math.min(10 - i, i);
            for (int j = 1; j < 10; j++) {
                if (j < a || j > 10 - a) {
                    System.out.print("        ");
                } else {
                    System.out.print(i + "x" + j + "=");
                    if (i * j < 10) {
                        System.out.print(" ");
                    }

                    System.out.print(i * j + "  ");
                }
            }

            System.out.println();
        }
    }
}
