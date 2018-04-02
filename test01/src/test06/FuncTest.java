package test06;

public class FuncTest {

	void func1(String str) {
		System.out.println("String 파람의 func1호출");
	}
	void func1() {
		System.out.println("func1호출");
	}
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.func1();
		ft.func1("abc");
	}
}
