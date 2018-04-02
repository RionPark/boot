package test09;

public class Person implements Action {

	public void eat() {
		System.out.println("사람이 밥먹네요");
	}
	public void walk() {
		System.out.println("사람이 걷습니다.");
	}
	public void see() {
		System.out.println("사람이 봅니다.");
	}
	public void sleep() {
		System.out.println("사람이 잡니다.");
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
