package test14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class UserInfo{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserInfo [age=" + age + ", name=" + name + "]";
	}
	
}
public class ListExam {
	
	static void printList(List<UserInfo> uiList) {
		for(int i=0;i<uiList.size();i++) {
			System.out.println(uiList.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<UserInfo> uiList = new ArrayList<UserInfo>();
		for(int i=0;i<=4;i++) {
			UserInfo ui = new UserInfo();
			ui.setAge(i+1);
			ui.setName("이름" + (i+1));
			uiList.add(ui);
		}
		printList(uiList);
		LinkedList<UserInfo> ll = new LinkedList<UserInfo>();

		for(int i=0;i<=4;i++) {
			UserInfo ui = new UserInfo();
			ui.setAge(i+1);
			ui.setName("링크드이름" + (i+1));
			ll.add(ui);
		}
		printList(ll);
	}
}
