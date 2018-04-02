package test03;

import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) {
		String[] strArr = new String[6];
		Scanner scan = new Scanner(System.in);
		System.out.println("로또번호를 ,를 기준으로 입력해주세요");
		String lottoStr = scan.nextLine();
//		System.out.println("입력하신 로또번호 : " + lottoStr);
		strArr = lottoStr.split(",");
		for(int i=0;i<strArr.length;i++) {
			System.out.println((i+1) + "번째 입력하신번호 : " + strArr[i]);
		}
	}
}
