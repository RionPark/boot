package test11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("이름", "홍길동");
		hm.put("주소", "경기도");
		hm.put("나이", "33");
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("이름", "김길동");
		hm1.put("주소", "서울");
		hm1.put("나이", "23");
//		System.out.println(hm.get("이름"));
//		System.out.println(hm.get("주소"));
//		System.out.println(hm.get("나이"));
		ArrayList<HashMap> al = new ArrayList<HashMap>();
		al.add(hm);
		al.add(hm1);
		for(int i=0;i<al.size();i++) {
			HashMap hashMap = al.get(i);
			System.out.println(hashMap.get("이름"));
			System.out.println(hashMap.get("주소"));
			System.out.println(hashMap.get("나이"));
		}
	}
}
