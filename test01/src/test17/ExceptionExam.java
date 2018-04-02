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
			throw new Exception("숫자 입력하랬더니!!");
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작!!");
		System.out.println("숫자로 변환하실 문자를 입력해주세요!!");
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		try {
			int a = Integer.parseInt(number);
		} catch (Exception e) {
			System.out.println("숫자 입력하랬더니!!");
		}
		System.out.println("프로그램 종료!!");
	}
}
