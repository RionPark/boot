package test05;


public class Son extends Father{

	public Son() {
		System.out.println("�Ƶ��� ȣ���ϼ̳׿�");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.age = 10;
		s.name = "�ڰ���";
		s.info();
		System.out.println(s.toString());
		//System.out.println(s.money);
		Father f = new Father();
	}
	
	
	
	
}
