package test07;

public class Execute2 {
	
	static int a=3;
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int getNum() {
		return 3;
	}
	public static void main(String[] args) {
		a= 4;
		Execute2.a = 5;
		Execute2 e = new Execute2();
		e.a = 10;
		System.out.println("abc");
	}
}
