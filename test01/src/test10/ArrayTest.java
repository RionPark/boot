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
		// arr�� 0��° ����� 9��° ����� 2���� ¦���� �־��ּ���.20
		for(int i=1;i<=arr.length;i++) {
			arr[i-1] = i*2;
		}
		printArray(arr);
	}
}
