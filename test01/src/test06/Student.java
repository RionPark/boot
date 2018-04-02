package test06;

public class Student extends Person{
	int test;
	public Student(String name, int age) {
		super(name, age);
		System.out.println(this.name + this.age + "학생 생성자 호출");
	}
	
	public void doWork() {
		System.out.println(name + "님이 공부를 합니다.");
	}
}
