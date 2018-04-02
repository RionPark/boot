package test04;

public class Method {
	public int a;
	private String str;
	
	public void setStr(String str) {
		this.str = str;
	}
	public void printTest() {
		System.out.println(str);
	}
	
	public int getNumber() {
		int a = 3;
		return a;
	}
}
