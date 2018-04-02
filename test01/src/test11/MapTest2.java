package test11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest2 {

	/*
	 * 개발팀	김개발	사원
		디자인팀	김디자	대리
		인사팀	김인사	과장

	 */
	public static void main(String[] args) {
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("부서", "개발팀");
		hm1.put("이름", "김개발");
		hm1.put("Depart", "사원");
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("부서", "디자인팀");
		hm2.put("이름", "김디자");
		hm2.put("Depart", "대리");
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("부서", "인사팀");
		hm3.put("이름", "김인사");
		hm3.put("Depart", "과장");
		ArrayList<HashMap<String,String>> al;
		al = new ArrayList<HashMap<String,String>>();
		al.add(hm1);
		al.add(hm2);
		al.add(hm3);
		int cnt = 1;
		for(int i=0;i<al.size();i++) {
			HashMap<String,String> hm = al.get(i);
			System.out.println((cnt++) + ":" + hm);
		}
		User u = new User();
		u.setName("박경훈");
		u.setDepart("개발팀");
		u.setAge("44");
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u);
		for(int i=0;i<userList.size();i++) {
			User user = userList.get(i);
			System.out.println(user);
		}
	}
}
