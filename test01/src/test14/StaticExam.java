package test14;

class Exam2{
	String a = new String("1");
}
public class StaticExam {
	public static void main(String[] args) {
		Exam2 e1 = new Exam2();
		Exam2 e2 = new Exam2();
		System.out.println(e1.a == e2.a);
	}
}
