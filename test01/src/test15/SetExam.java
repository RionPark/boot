package test15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>();
		strSet.add("1");
		System.out.println(strSet.size());
		Iterator<String> it = strSet.iterator();
		int cnt = 1;
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
}
