package test14;

class Exam{
	String text = "abc";
	public void print() {
		System.out.println("�̱���Ŭ������ ����Ʈ �Լ� ȣ��!!");
	}
}
public class Test {
	Exam exam;
	
	public static void main(String[] args) {
		Test t = new Test();
		t.exam = new Exam();
		t.exam.print();
	}
}
