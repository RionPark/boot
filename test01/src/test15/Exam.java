package test15;

public class Exam {
	int a;
	
	static void addInt(Exam e) {
		e.a = 4;
	}
	public static void main(String[] args) {
		Exam e = new Exam();
		System.out.println(e.a);
		addInt(e);
		System.out.println(e.a);
	}
}
