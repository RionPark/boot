package test07;

public class Cat extends Animal{
	
	public Cat(String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println(type + "고양이가 사료를 먹습니다.");
	}
}
