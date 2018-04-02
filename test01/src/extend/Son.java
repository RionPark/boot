package extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Father {
	void printSome(String some) {
		System.out.println("아빠의 프린트썸 : " + some);
	}
}

public class Son extends Father{
	void printSome(String some1) {
		super.printSome(some1);
		System.out.println("아들 함수 : " + some1);
		//return 1;
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.printSome("aasdf");
		Scanner scan = new Scanner(System.in);
		List list = new ArrayList();
	}
}
