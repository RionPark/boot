package test12;

public class Dog {
	private String name;
	private int age;
	private String kind;

	public Dog(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	//http://mariadb.org
	public void back() {
		System.out.println( name + "이 짖습니다.");
	}
	public void run() {
		System.out.println( name + "이 달립니다.");
	}
	public String toString() {
		return kind + "종이고 이름은 " + name + "이고 " + age + "살 입니다.";
	}
}
