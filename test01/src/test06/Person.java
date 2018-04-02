package test06;

public class Person {
	String name;
	int age;
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void doSleep() {
		System.out.println(name+"님이 잠을 잡니다.");
	}
	public void doWakeup() {
		System.out.println(name+"님이 일어납니다.");
	}
	public void doWork() {
		System.out.println(name+"님이 일을 합니다.");
	}
}
