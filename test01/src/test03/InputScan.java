package test03;

import java.util.Scanner;

public class InputScan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���Ͻô� ���ڸ� �Է����ּ��� : ");
		String inputStr = scan.nextLine();
		
		if(inputStr.equals("A")) {
			System.out.println("A������Ʈ!");
		}else {
			System.out.println("������Ʈ���� Ʋ�Ƚ��ϴ�.");
		}
	}
	
}
