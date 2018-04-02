package test08;
class B{
	void test() {
		System.out.println("B클래스");
	}
}
public class A extends B{

	void test(int a) {
		System.out.println("A클래스1");
	}
	void test() {
		System.out.println("A클래스2");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.test(1);
		a.test();
	}
}
