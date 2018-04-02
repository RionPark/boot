package test02;

public class Cal {
// \\192.168.0.101
	static void plus(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
	}
	static void minus(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
	}
	static void mutiple(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
	}
	static void division(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
	
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 2;
		plus(num1, num2);	
		minus(num1, num2);
		mutiple(num1, num2);
		division(num1, num2);
	}
}
