public class Hw11_2 {
    static public void main(String[] args) {
        /*
        2. (多層繼承)承上題，再定義繼承「Rectangle」類別的衍生類別「Cube」，它包含「height」屬性，代表長方體的高，及一個計算長方體體積的方法「ComputeVolume()」。
        程式執行時，建立一類別「Cube」的物件變數，輸入長方體形的長、寬及高，並分別存入此物件變數的「length」、「width」與「height」屬性，最後呼叫方法「ComputeVolume()」，輸出長方體的體積。
        */

        Cube cube = new Cube(10, 5, 3);
        System.out.println("Volume: " + cube.ComputeVolume(cube.length, cube.width, cube.height));
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
    public int length;
    public int width;

    static public void main(String[] args) {}
}

public class Cube extends Rectangle {
    public Cube(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int height;
    public int ComputeVolume(int length, int width, int height) {
        return length * width * height;
    }
}