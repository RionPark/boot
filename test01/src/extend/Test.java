package extend;

public class Test {

	int a = 3;
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.a);
		t.a = 10;
		System.out.println(t.a);
		t = new Test();
		
		System.out.println(t.a);
	}
}
