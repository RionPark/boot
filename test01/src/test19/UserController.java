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
		System.out.println("���������� �Է����ּ���");
		System.out.print("��ȣ : ");
		String num = scan.nextLine();
		System.out.println("�̸� : ");
		String name = scan.nextLine();
		System.out.println("���� : ");
		String age = scan.nextLine();
		System.out.println("�ּ� : ");
		String address = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		map.put("name", name);
		map.put("age", age);
		map.put("address", address);
		int result = dbCon.insert(map);
		if(result==1) {
			System.out.println("���������� ����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �����Ͽ����ϴ�.");
		}
	}
	
	public void printUserList(String name) {
		List<Map<String, String>> list = dbCon.select();
		for(Map<String, String> map : list) {
			System.out.println(map);
		}
		System.out.println("��µ� ��������Ʈ �� ���� : " + list.size());
	}
	public void deleteUser() {
		System.out.println("�����Ͻ� ������ȣ�� �����ּ���");
		String num = scan.nextLine();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", num);
		int result = dbCon.delete(map);
		if(result==1) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("�������� �ʾҽ��ϴ�.");
		}
	}
	public static void main(String[] args) {
		UserController uc = new UserController();
		System.out.println("���Ͻô� ��ȣ�� �Է����ּ���");
		System.out.println("1:�������, 2:��������, 3:��������, 4:��������Ʈ, q:���α׷�����");
		Scanner scan = new Scanner(System.in);
		while(true) {
			String op = scan.nextLine();
			if("q".equals(op)) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}else if("1".equals(op)) {
				uc.insertUser();
			}else if("4".equals(op)){
				uc.printUserList("");
			}else if("2".equals(op)) {
				uc.deleteUser();
			}else {
				System.out.println("���� �����غ����Դϴ�. �ٽ� �Է¹ٶ��ϴ�.");
			}
		}
	}
}
