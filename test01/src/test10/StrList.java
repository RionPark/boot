package test10;

import java.util.ArrayList;

public class StrList {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		//strList�� 1���� 10���� �������ּ���.
		for(int i=1;i<=10;i++) {
			strList.add(i+"");
		}
		int sum = 0;
		for(int i=0;i<strList.size();i++) {
			sum += Integer.parseInt(strList.get(i));
		}
		System.out.println(sum);
	}
}
