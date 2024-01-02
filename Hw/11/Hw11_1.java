public class Hw11_1 {
    static public void main(String[] args) {
        /*
        1. (單一繼承)寫一程式，定義圖形類別「Shape」，它包含「area」屬性，代表圖形的面積，及一個計算圖形面積的方法「ComputeArea()」。
        接著定義類別「Shape」的衍生類別「Rectangle」，它包含「length」與「width」兩個屬性，分別代表長方形的長與寬。
        程式執行時，建立一類別「Rectangle」的物件變數，輸入長方形的長與寬，並分別存入此物件變數的「length」與「width」屬性，最後呼叫方法「ComputeArea()」，輸出長方形的面積。
        */

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area: " + rectangle.ComputeArea(rectangle.length, rectangle.width));
    }
}

class Shape {
    public int area;
    public int ComputeArea(int length, int width) {
        area = length * width;
        return area;
    }

    static public void main(String[] args) {}
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int length;
    public int width;

    static public void main(String[] args) {}
}

