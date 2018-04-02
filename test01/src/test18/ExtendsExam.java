package test18;
class Father{
	Father() {
		System.out.println("a.난 아빠");
	}
	public void print() throws Exception{
		System.out.println("b.난 아빠 아들은 어디서든 날 호출할 수 있음!!");
	}
}
class Son extends Father{
	Son() throws Exception {
		super.print();
		System.out.println("c.난 아들");
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
