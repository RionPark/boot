package test06;

public class FuncTest {

	void func1(String str) {
		System.out.println("String �Ķ��� func1ȣ��");
	}
	void func1() {
		System.out.println("func1ȣ��");
	}
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.func1();
		ft.func1("abc");
	}
}
