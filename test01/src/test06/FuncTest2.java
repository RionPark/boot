package test06;

public class FuncTest2 extends FuncTest{

	void func1(String str) {
		System.out.println("params : string");
	}
	void func1(String str, int a) {
		System.out.println("params : string, int");
	}
	void func1(int a, String str ) {
		System.out.println("params : int, string");
	}
	public static void main(String[] args) {
		FuncTest2 ft2 = new FuncTest2();
		ft2.func1();
		ft2.func1("abc");
		ft2.func1("abc",1);
		ft2.func1(1,"abc");
	}
}
