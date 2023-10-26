public class Ex2 {
	public static void main(String[] args){
		int a = 0, b = 1, c;
		c = ++a + b; //先處理c=a+b,在處理a++;
		System.out.println("a=" + a + " ,c=" + c);
	}
}