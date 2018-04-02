package test04;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(10)+1;
		int rNum2 = r.nextInt(10)+1;
		System.out.println(rNum + "," + rNum2);
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			System.out.println("첫번째 숫자를 맞춰보세요:");
			int num = scan.nextInt();
			if(rNum==num) {
				System.out.println("첫번째 당첨 번호 " + rNum + "를 맞췄습니다.");
				for(int j=1;j<=10;j++) {
					System.out.println("두번째 숫자를 맞춰보세요:");
					num = scan.nextInt();
					if(rNum2==num) {
						System.out.println("두번째 당첨 번호 " + rNum2 + "를 맞췄습니다.");
						return;
					}
				}
			}
		}
	}
}
