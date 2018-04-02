package test11;

import java.util.ArrayList;

public class StringTest {

	public String test() {
		String str = new String("스트링이에요!!");
		return str;
	}
	public void test1() {
		String str = new String("스트링이에요!!");
	}
	
	public static void main(String[] args) {
		StringTest st = new StringTest();
		String str = st.test();
		System.out.println(str);
		ArrayList<User> uList = new ArrayList<User>();
		for(int i=0;i<3;i++) {
			User u = new User();
			u.setAge(i+"");
			u.setDepart(i + "번째 부서");
			u.setName("이름" + i);
			uList.add(u);
		}
		System.out.println(uList);
	}
}
