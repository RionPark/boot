package test12;

import java.util.Random;

public class ForExam extends Thread{
	int maxNum =10;
	String name;
	ForExam(int maxNum, String name){
		this.maxNum = maxNum;
		this.name = name;
	}
	public void run() {
		Random r = new Random();
		for(int i=0;i<this.maxNum;i++) {
			System.out.println(this.name + i);
			int sp = r.nextInt(1000)+500;
			try {
				Thread.sleep(sp);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ForExam fe = new ForExam(100,"첫번째");
		ForExam fe2 = new ForExam(100,"두번째");
		fe.start();
		fe2.start();
	}
}
