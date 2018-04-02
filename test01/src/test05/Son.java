package test05;


public class Son extends Father{

	public Son() {
		System.out.println("아들을 호출하셨네요");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.age = 10;
		s.name = "박경훈";
		s.info();
		System.out.println(s.toString());
		//System.out.println(s.money);
		Father f = new Father();
	}
	
	
	
	
}
