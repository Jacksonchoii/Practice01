package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		final double D = 1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		float exchange = sc.nextFloat();
		
		double m = exchange/D;
		
		System.out.println("받으실 달러는 "+m);
		
		sc.close();
	}

}
