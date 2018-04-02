package test04;

public class ConExam {
	int num =2;
	ConExam(){
	}
	
	void changeNum() {
		int num = 3;
	}
	public static void main(String[] args) {
		ConExam ce = new ConExam();
		ce.changeNum();
		System.out.println(ce.num);
	}
}
