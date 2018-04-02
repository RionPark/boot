package test05;

public class Father {
	String name;
	protected int age;
	private int money=1000000000;
	
	public Father() {
		System.out.println("아빠를 호출하셨네요");
		System.out.println(money);
	}
	public Father(String name) {
		
	}
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void work() {
		System.out.println("아버지가 일합니다.");
	}
	public void work(String jobName) {
		System.out.println("아버지가 " + jobName + "에 관련된 일을 하십니다.");
	}
	public void sleep() {
		System.out.println("아버지가 주무십니다.");
	}
	public void info() {
		System.out.println("아버님의 성함은 " + name + " 입니다.");
		System.out.println("아버님의 나이는 " + age + " 입니다.");
	}
	public static void main(String[] args) {
		Father f = new Father("Rion",62);
		f.info();
		f.work("개발");
	}
	
	
}
