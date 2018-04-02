package test10;

import java.util.Scanner;

public class ForIf {
	public static void main(String[] args) {
		String confirm = "";
		if(confirm.equals("")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("지금이 밤인가요?");
			System.out.println("맞으면 1 아니면 2를 입력해주세요 : ");
			confirm = scan.nextLine();
			int menu = 0;
			try {
				menu = Integer.parseInt(confirm);
			}catch(Exception e) {
				System.out.println("1 아니면 2를 입력하라고!!!");
			}
			if(menu==1) {
				System.out.println("밤이군요");
			}else {
				System.out.println("낮이군요");
			}
		}
		final float ff = 1.1f;
		double dd = 1.3;
	}
}
