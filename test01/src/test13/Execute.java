package test13;

import java.util.ArrayList;

class A{
	void print() {
		System.out.println("�� ����Ŭ������ ����Ʈ �Լ�!!!");
	}
}
public class Execute {
	A a;
	
	public static void main(String[] args) {
		Execute e = new Execute();
		e.a = new A();
		e.a.print();
	}
}

