package extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Father {
	void printSome(String some) {
		System.out.println("�ƺ��� ����Ʈ�� : " + some);
	}
}

public class Son extends Father{
	void printSome(String some1) {
		super.printSome(some1);
		System.out.println("�Ƶ� �Լ� : " + some1);
		//return 1;
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.printSome("aasdf");
		Scanner scan = new Scanner(System.in);
		List list = new ArrayList();
	}
}
