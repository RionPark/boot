package test06;

public class ThisTest {
	public ThisTest() {
		this(1);
		System.out.println("1.기본생성자 호출");
	}
	public ThisTest(int a) {
		this("abc");
		System.out.println("2.int param생성자 호출");
	}
	public ThisTest(String a) {
		System.out.println("3.String param생성자 호출");
	}
}
