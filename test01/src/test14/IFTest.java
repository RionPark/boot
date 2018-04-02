package test14;

interface Action{
	public int size();
	public void print();
}

class ArrayAction implements Action{
	public int size() {
		return 0;
	}
	public void print() {
		System.out.println("abc");
	}
}
class TestAction implements Action{
	public int size() {
		return 1;
	}
	public void print() {
	}
}
public class IFTest {
	public static void main(String[] args) {
		Action aa = new ArrayAction();
		int size = aa.size();
		aa.print();
		Action ta = new TestAction();
		size = ta.size();
		ta.print();
	}
}
