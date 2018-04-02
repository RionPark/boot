package test10;

import java.util.ArrayList;

public class ListExam01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add(1);
		list.add(true);
		list.add(1.3);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		//1부터 10까지 al에 값을 넣어주시구요.
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		//System.out.println(al);
		
		//al이 가지고 있는 모든 값의 합을 구해서 출력해주세요.
		int sum = 0;
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
//			System.out.println(al.get(i));
		}
		System.out.println(sum);
	}
}
