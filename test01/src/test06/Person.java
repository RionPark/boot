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
		System.out.println(name+"���� ���� ��ϴ�.");
	}
	public void doWakeup() {
		System.out.println(name+"���� �Ͼ�ϴ�.");
	}
	public void doWork() {
		System.out.println(name+"���� ���� �մϴ�.");
	}
}
