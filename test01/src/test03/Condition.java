package test03;

public class Condition {

	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		System.out.println("a<b : " + (a<b));
		System.out.println("a>b : " + (a>b));
		System.out.println("a==b : " + (a==b));
		System.out.println("a<=b : " + (a<=b));
		System.out.println("a>=b : " + (a>=b));
		
		if(a<b) {
			System.out.println("a�� b���� �۽��ϴ�.");
		}else if(a>b){
			System.out.println("a�� b���� ���� �ʽ��ϴ�.");
		}else {
			System.out.println("a�� b�� �����ϴ�.");
		}
		
		
	}
}
