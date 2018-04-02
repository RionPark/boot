package test13;

import java.util.ArrayList;

class A{
	void print() {
		System.out.println("난 에이클레스의 프린트 함수!!!");
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

