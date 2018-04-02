package test14;

class Exam{
	String text = "abc";
	public void print() {
		System.out.println("이그잼클래스의 프린트 함수 호출!!");
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
