package test19;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
	private DBCon dbCon;
	private Scanner scan;
	public UserController() {
		try {
			dbCon = new DBCon("dbcon.properties");
			scan = new Scanner(System.in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void insertUser() {
		System.out.println("유저정보를 입력해주세요");
		System.out.print("번호 : ");
		String num = scan.nextLine();
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("나이 : ");
		String age = scan.nextLine();
		System.out.println("주소 : ");
		String address = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		map.put("name", name);
		map.put("age", age);
		map.put("address", address);
		int result = dbCon.insert(map);
		if(result==1) {
			System.out.println("정상적으로 저장되었습니다.");
		}else {
			System.out.println("저장이 실패하였습니다.");
		}
	}
	
	public void printUserList(String name) {
		List<Map<String, String>> list = dbCon.select();
		for(Map<String, String> map : list) {
			System.out.println(map);
		}
		System.out.println("출력된 유저리스트 총 갯수 : " + list.size());
	}
	public void deleteUser() {
		System.out.println("삭제하실 유저번호를 적어주세요");
		String num = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		int result = dbCon.delete(map);
		if(result==1) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제되지 않았습니다.");
		}
	}
	public static void main(String[] args) {
		UserController uc = new UserController();
		System.out.println("원하시는 번호를 입력해주세요");
		System.out.println("1:유저등록, 2:유저삭제, 3:유저수정, 4:유저리스트, q:프로그램종료");
		Scanner scan = new Scanner(System.in);
		while(true) {
			String op = scan.nextLine();
			if("q".equals(op)) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}else if("1".equals(op)) {
				uc.insertUser();
			}else if("4".equals(op)){
				uc.printUserList("");
			}else if("2".equals(op)) {
				uc.deleteUser();
			}else {
				System.out.println("아직 서비스준비중입니다. 다시 입력바랍니다.");
			}
		}
	}
}
