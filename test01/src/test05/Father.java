package test05;

public class Father {
	String name;
	protected int age;
	private int money=1000000000;
	
	public Father() {
		System.out.println("�ƺ��� ȣ���ϼ̳׿�");
		System.out.println(money);
	}
	public Father(String name) {
		
	}
	public Father(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void work() {
		System.out.println("�ƹ����� ���մϴ�.");
	}
	public void work(String jobName) {
		System.out.println("�ƹ����� " + jobName + "�� ���õ� ���� �Ͻʴϴ�.");
	}
	public void sleep() {
		System.out.println("�ƹ����� �ֹ��ʴϴ�.");
	}
	public void info() {
		System.out.println("�ƹ����� ������ " + name + " �Դϴ�.");
		System.out.println("�ƹ����� ���̴� " + age + " �Դϴ�.");
	}
	public static void main(String[] args) {
		Father f = new Father("Rion",62);
		f.info();
		f.work("����");
	}
	
	
}
