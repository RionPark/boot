package test08;
class B{
	void test() {
		System.out.println("BŬ����");
	}
}
public class A extends B{

	void test(int a) {
		System.out.println("AŬ����1");
	}
	void test() {
		System.out.println("AŬ����2");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.test(1);
		a.test();
	}
}
