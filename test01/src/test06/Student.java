package test06;

public class Student extends Person{
	int test;
	public Student(String name, int age) {
		super(name, age);
		System.out.println(this.name + this.age + "�л� ������ ȣ��");
	}
	
	public void doWork() {
		System.out.println(name + "���� ���θ� �մϴ�.");
	}
}
