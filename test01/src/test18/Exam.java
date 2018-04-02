package test18;

public class Exam {
	String str = "123";
	public void print() {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Exam e = new Exam();
		e.print();
		e.str="abc";
		e.print();
		String classStr = "test18.Exam";
		try {
			Class cls = Class.forName(classStr);
			System.out.println(cls.getName());
			try {
				Exam e1 = (Exam)cls.newInstance();
				e1.print();
				e1.str = "abc";
				e1.print();
			} catch (InstantiationException | IllegalAccessException e1) {
			}
		} catch (ClassNotFoundException e1) {
		}
	}
}
