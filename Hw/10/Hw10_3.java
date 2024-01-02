public class Hw10_3 {
    public static void main(String[] args) {
        /*
        寫一程式，定義一類別Shape，並在Shape中定義兩種建構子，分別計算正方形面積及長方形面積。
        在主類別內宣告兩個資料型態為Shape的物件變數，並利用這兩個物件變數，分別求邊長=3的正方形面積及長=4,寬=5的長方形面積。
        */

        Shape s1 = new Shape(3);
        Shape s2 = new Shape(4, 5);
    }
}

public class Shape {
    public Shape(int a) {
        System.out.println("正方形面積為: " + a * a);
    }

    public Shape(int a, int b) {
        System.out.println("長方形面積為: " + a * b);
    }

    public static void main(String[] args) {}
}

