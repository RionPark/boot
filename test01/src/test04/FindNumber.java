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
			System.out.println("ù��° ���ڸ� ���纸����:");
			int num = scan.nextInt();
			if(rNum==num) {
				System.out.println("ù��° ��÷ ��ȣ " + rNum + "�� ������ϴ�.");
				for(int j=1;j<=10;j++) {
					System.out.println("�ι�° ���ڸ� ���纸����:");
					num = scan.nextInt();
					if(rNum2==num) {
						System.out.println("�ι�° ��÷ ��ȣ " + rNum2 + "�� ������ϴ�.");
						return;
					}
				}
			}
		}
	}
}
