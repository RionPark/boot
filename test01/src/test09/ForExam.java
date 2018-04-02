package test09;

import java.util.Scanner;

public class ForExam {

	public static void setText(String a) {
		if(a==null) {
			return;
		}
		System.out.println("입력하신 문자열 : " + a);
	}
	public static void main(String[] args) {
		setText(null);
		setText("abc");
		int a = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력해주세요 : ");
			String num = scan.nextLine();
			try {
				a = Integer.parseInt(num);
				System.out.println("숫자를 입력하셨군요");
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력해주세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
