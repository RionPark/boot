package test09;

public class Person implements Action {

	public void eat() {
		System.out.println("����� ��Գ׿�");
	}
	public void walk() {
		System.out.println("����� �Ƚ��ϴ�.");
	}
	public void see() {
		System.out.println("����� ���ϴ�.");
	}
	public void sleep() {
		System.out.println("����� ��ϴ�.");
	}

	public static void main(String[] args) {
		Object o = new Person();
		Person p = new Person();
		Action a = new Person();
		Action a2 = new Animal();
		a.eat();
		a2.eat();
	}
}
