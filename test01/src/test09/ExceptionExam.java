package test09;

import java.util.Scanner;

public class ExceptionExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		String num1 = scan.nextLine();
		int n1 = 0;
		int n2 = 0;
		try {
			n1 = Integer.parseInt(num1);
		} catch (Exception e) {
			System.out.println("첫번째숫자가 숫자 아니에요!!!!");
		}

		System.out.println("두번째 숫자를 입력해주세요 : ");
		String num2 = scan.nextLine();
		try {
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			System.out.println("두번째숫자가 숫자 아니에요!!!!");
		}

		
		System.out.println(n1 + " + " + n2 + "=" + (n1 + n2));

	}
}
