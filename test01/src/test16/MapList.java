package test16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapList {

	static void insertMap(Map<String,String> map) {
		for(int i=1;i<=10;i++) {
			map.put("key" + i,"value" + i);
		}
		
	}
	static void printMap(Map<String,String> map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.printf("key=%s, value=%s \n",key, value);
		}
	}
	public static void main(String[] args) {
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		Map<String,String> map = new HashMap<String,String>();
		map.put("num", "1");
		map.put("name", "°­Àç¿µ");
		map.put("date", "03-27");
		mapList.add(map);
		//mariadb client maven
		map = new HashMap<String,String>();
		map.put("num", "2");
		map.put("name", "±ÇÇõÁø");
		map.put("date", "03-27");
		mapList.add(map);
		
		map = new HashMap<String,String>();
		map.put("num", "3");
		map.put("name", "±èÀ±±Ô");
		map.put("date", "03-27");
		mapList.add(map);
		
		for(Map<String,String> m : mapList) {
			System.out.println(m);
		}
	}
}
