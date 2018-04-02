package test03;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("아이디 : ");
		Scanner scan = new Scanner(System.in);
		String id = scan.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = scan.nextLine();
		if(id.equals("test")) {
			if(pwd.equals("test")) {
				System.out.println(id +"님 로그인에 성공하셨습니다.");
			}else {
				System.out.println(id + "님 비밀번호 확인 바랍니다.");
			}
		}else {
			System.out.println("없는 아이디입니다.");
		}
	}
}
