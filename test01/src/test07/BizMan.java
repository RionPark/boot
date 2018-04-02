package test07;

public class BizMan extends Person{
	public BizMan(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void doWork() {
		System.out.println(name + "님이 일을 합니다.");
	}
}
