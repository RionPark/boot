package test09;

import java.util.Scanner;

public class ForExam {

	public static void setText(String a) {
		if(a==null) {
			return;
		}
		System.out.println("�Է��Ͻ� ���ڿ� : " + a);
	}
	public static void main(String[] args) {
		setText(null);
		setText("abc");
		int a = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���ڸ� �Է����ּ��� : ");
			String num = scan.nextLine();
			try {
				a = Integer.parseInt(num);
				System.out.println("���ڸ� �Է��ϼ̱���");
				break;
			}catch(Exception e) {
				System.out.println("���ڸ� �Է����ּ���");
			}
		}
		System.out.println("���α׷� ����");
	}
}
