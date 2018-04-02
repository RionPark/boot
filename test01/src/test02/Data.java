package test02;

public class Data {
	
	public static void main(String[] args) {
		Data d = new Data();
		String str = new String("저는 스트링입니다.");
		System.out.println(str);
		String s1 = "s";
		String s2 = new String("s");
		String s3 = new String("t");
		System.out.println(s2.equals(s3));
		
		String numStr = "22";
		int num1 = 52;
		int num2 = Integer.parseInt(numStr);
		System.out.println(num2 + num1);
	}
}
