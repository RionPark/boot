package test03;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random r = new Random();
		int[] numArr = new int[6];
		for(int i=0;i<6;i++) {
			numArr[i] = r.nextInt(32)+1;
			System.out.print(numArr[i] + ",");
		}
		System.out.println();
		int[] lottoNums = {2,10,11,32,20,33};
		
		int correctCnt = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(numArr[i]==lottoNums[j]) {
					correctCnt++;
				}
			}
		}
		System.out.println(correctCnt);
	}
}
