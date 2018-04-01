package com.example.demo.utils;

public class Exam {

	public static void main(String[] args){
		int totalCnt = 1011;
		int rowCnt = 10;
		int totalPage = (int) Math.ceil((double)totalCnt/rowCnt);
		
		System.out.println(totalPage);
	}
}
