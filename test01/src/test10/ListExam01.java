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
		//1���� 10���� al�� ���� �־��ֽñ���.
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		//System.out.println(al);
		
		//al�� ������ �ִ� ��� ���� ���� ���ؼ� ������ּ���.
		int sum = 0;
		for(int i=0;i<al.size();i++) {
			sum += al.get(i);
//			System.out.println(al.get(i));
		}
		System.out.println(sum);
	}
}
