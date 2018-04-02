package test10;

import java.util.ArrayList;

public class ArrayTest {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		// arr의 0번째 방부터 9번째 방까지 2부터 짝수를 넣어주세요.20
		for(int i=1;i<=arr.length;i++) {
			arr[i-1] = i*2;
		}
		printArray(arr);
	}
}
