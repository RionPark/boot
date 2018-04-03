package last;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {70,60,50,100,40};
		
		Arrays.sort(arr);
		for(int i=0;i<5;i++) {
			System.out.printf("arr[%d]=%d\n", i,arr[i]);
		}
	}
}
