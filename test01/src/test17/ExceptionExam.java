package test17;

import java.util.Scanner;

public class ExceptionExam {
	
	static int parseInt(String number) throws Exception {
		int result = 0;
		try {
			result = Integer.parseInt(number);
		}catch(Exception e) {
			
		}
		if(result==0) {
			throw new Exception("���� �Է��Ϸ�����!!");
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("���α׷� ����!!");
		System.out.println("���ڷ� ��ȯ�Ͻ� ���ڸ� �Է����ּ���!!");
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		try {
			int a = Integer.parseInt(number);
		} catch (Exception e) {
			System.out.println("���� �Է��Ϸ�����!!");
		}
		System.out.println("���α׷� ����!!");
	}
}
