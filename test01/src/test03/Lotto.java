package test03;

import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) {
		String[] strArr = new String[6];
		Scanner scan = new Scanner(System.in);
		System.out.println("�ζǹ�ȣ�� ,�� �������� �Է����ּ���");
		String lottoStr = scan.nextLine();
//		System.out.println("�Է��Ͻ� �ζǹ�ȣ : " + lottoStr);
		strArr = lottoStr.split(",");
		for(int i=0;i<strArr.length;i++) {
			System.out.println((i+1) + "��° �Է��ϽŹ�ȣ : " + strArr[i]);
		}
	}
}
