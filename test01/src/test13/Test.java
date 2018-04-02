package test13;

import java.util.ArrayList;

public class Test {
	String text;
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		
		Test[] tArr = new Test[3];
		System.out.println(tArr[0]);
		tArr[0] = new Test();
		System.out.println(tArr[0]);
		tArr[0].print("abc");
		tArr[1] = new Test();
		
		ArrayList<Test> al = new ArrayList<Test>();
		al.add(new Test());
		
		Test tt = al.get(0);
		tt.text = "abc";
		al.get(0).text = "abc";	
		
	}
}
