package test11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("�̸�", "ȫ�浿");
		hm.put("�ּ�", "��⵵");
		hm.put("����", "33");
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("�̸�", "��浿");
		hm1.put("�ּ�", "����");
		hm1.put("����", "23");
//		System.out.println(hm.get("�̸�"));
//		System.out.println(hm.get("�ּ�"));
//		System.out.println(hm.get("����"));
		ArrayList<HashMap> al = new ArrayList<HashMap>();
		al.add(hm);
		al.add(hm1);
		for(int i=0;i<al.size();i++) {
			HashMap hashMap = al.get(i);
			System.out.println(hashMap.get("�̸�"));
			System.out.println(hashMap.get("�ּ�"));
			System.out.println(hashMap.get("����"));
		}
	}
}
