package test15;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {

	public static void main(String[] args) {
		ArrayList<String> alList1 = new ArrayList<String>();
		alList1.add("str1_1");
		alList1.add("str1_2");

		ArrayList<String> alList2 = new ArrayList<String>();
		alList2.add("str2_1");
		alList2.add("str2_2");
		
		ArrayList<ArrayList<String>> alalList;
		alalList = new ArrayList<ArrayList<String>>();
		alalList.add(alList1);
		alalList.add(alList2);
		
		System.out.println(alalList.get(1).get(1));
		
		ArrayList<HashMap<String, String>> hmList;
		hmList = new ArrayList<HashMap<String, String>>();
	}
}
