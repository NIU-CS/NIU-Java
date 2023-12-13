public class Hw7_4 {
    public static void main(String[] args) {
        // 寫一程式，判斷3x5矩陣中，共有幾列的資料列全為0。(提示：使用「continue標籤名稱;」)
        int[][] matrix = {
            {0, 0, 1, 0, 2},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1}
        };

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] != 0) continue;
                if (j == 4) count++;
            }
        }

        System.out.println(count);
    }
}
