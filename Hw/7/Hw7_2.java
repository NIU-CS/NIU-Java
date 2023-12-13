public class Hw7_2 {
    public static void main(String[] args) {
        int[] count = new int[11];
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 6) + 1;
            random += (int) (Math.random() * 6) + 1;
            count[random - 2]++;
        }

        for (int i = 0; i < 11; i++) {
            System.out.println((i + 2) + "點出現" + count[i] + "次");
        }
    }
}
