package test05;

import java.io.OutputStream;

public class FunctionTest {
		
	void printStr(String str) {
		System.out.println(str);
	}
	
	void printStr(int str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		FunctionTest ft = new FunctionTest();
		ft.printStr("³ª³ª³ª~");
		ft.printStr(123);	
	}
}
