package test09;

import java.util.Scanner;

public class NumberException {
	public static int getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		String num = scan.nextLine();
		int a = 0;
		try {
			a = Integer.parseInt(num);
		}catch(Exception e) {
			System.out.println("���� �Է��϶��!!!");
			a = getNumber();
		}
		return a;
	}
	
	public static void main(String[] args) {
		int number = getNumber();
		System.out.println("�Է��Ͻ� ���ڴ� " + number + "�Դϴ�.");
	}
}
