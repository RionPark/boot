package test06;

public class ThisTest {
	public ThisTest() {
		this(1);
		System.out.println("1.�⺻������ ȣ��");
	}
	public ThisTest(int a) {
		this("abc");
		System.out.println("2.int param������ ȣ��");
	}
	public ThisTest(String a) {
		System.out.println("3.String param������ ȣ��");
	}
}
