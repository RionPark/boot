package test09;

import java.util.Scanner;

public class ExceptionExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է����ּ��� : ");
		String num1 = scan.nextLine();
		int n1 = 0;
		int n2 = 0;
		try {
			n1 = Integer.parseInt(num1);
		} catch (Exception e) {
			System.out.println("ù��°���ڰ� ���� �ƴϿ���!!!!");
		}

		System.out.println("�ι�° ���ڸ� �Է����ּ��� : ");
		String num2 = scan.nextLine();
		try {
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			System.out.println("�ι�°���ڰ� ���� �ƴϿ���!!!!");
		}

		
		System.out.println(n1 + " + " + n2 + "=" + (n1 + n2));

	}
}
