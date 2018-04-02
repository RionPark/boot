package test17;

import java.util.ArrayList;
import java.util.List;

public class ErrorClass {
	
	static void printList(List<String> al) throws Exception {
		try {
			for(int i=0;i<3;i++) {
				System.out.println(al.get(i));
			}
		}catch(Exception e) {
			throw new Exception("Error!!");
		}
	}
	public static void main(String[] args) {
		System.out.println("리스트 프로그램 시작");
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		try {
			printList(al);
		} catch (Exception e) {
			System.out.println("리스트 찍다 에러남 : " + e.getMessage());
		}
		System.out.println("리스트 프로그램 종료");
	}
}
