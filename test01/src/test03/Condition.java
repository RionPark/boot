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
			System.out.println("a는 b보다 작습니다.");
		}else if(a>b){
			System.out.println("a는 b보다 작지 않습니다.");
		}else {
			System.out.println("a와 b는 같습니다.");
		}
		
		
	}
}
