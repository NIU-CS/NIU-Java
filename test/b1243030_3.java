public class b1243030_3 {
    public static void main(String args[]) {
        int animal = 40;
        int foot = 100;

        foot /= 2;
        int rabbit = (foot - animal);
        int chicken = animal - rabbit;

        System.out.print("rabbit: " + rabbit + "\nchicken: " + chicken);
    }
}