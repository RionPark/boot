package test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name", "�ڰ���");
		map.put("name1", "�ڰ���");
		map.put("address","����");

		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}
