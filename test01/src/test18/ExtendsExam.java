package test18;
class Father{
	Father() {
		System.out.println("a.�� �ƺ�");
	}
	public void print() throws Exception{
		System.out.println("b.�� �ƺ� �Ƶ��� ��𼭵� �� ȣ���� �� ����!!");
	}
}
class Son extends Father{
	Son() throws Exception {
		super.print();
		System.out.println("c.�� �Ƶ�");
	}
}
public class ExtendsExam {
	public static void main(String[] args) {
		try {
			Son s = new Son();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
