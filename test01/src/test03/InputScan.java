package test03;

import java.util.Scanner;

public class InputScan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하시는 글자를 입력해주세요 : ");
		String inputStr = scan.nextLine();
		
		if(inputStr.equals("A")) {
			System.out.println("A프로젝트!");
		}else {
			System.out.println("프로젝트명이 틀렸습니다.");
		}
	}
	
}
