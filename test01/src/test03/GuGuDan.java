package test03;

public class GuGuDan {
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d,",j,i,(i*j));
			}
			System.out.println();
		}
		
	}
}
