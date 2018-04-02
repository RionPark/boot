package test09;

import java.util.Scanner;

public class NumberException {
	public static int getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String num = scan.nextLine();
		int a = 0;
		try {
			a = Integer.parseInt(num);
		}catch(Exception e) {
			System.out.println("숫자 입력하라고!!!");
			a = getNumber();
		}
		return a;
	}
	
	public static void main(String[] args) {
		int number = getNumber();
		System.out.println("입력하신 숫자는 " + number + "입니다.");
	}
}
