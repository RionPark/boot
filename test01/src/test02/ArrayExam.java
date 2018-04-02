package test02;

public class ArrayExam {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		for(int i=4;i>=0;i--) {
			intArr[4-i] = (i+1)*2;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(intArr[i]);
		}
	}
}
