package test03;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("���̵� : ");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		System.out.println("��й�ȣ : ");
		String pwd = scan.nextLine();
		if(id.equals("test")) {
			if(pwd.equals("test")) {
				System.out.println(id +"�� �α��ο� �����ϼ̽��ϴ�.");
			}else {
				System.out.println(id + "�� ��й�ȣ Ȯ�� �ٶ��ϴ�.");
			}
		}else {
			System.out.println("���� ���̵��Դϴ�.");
		}
	}
}
