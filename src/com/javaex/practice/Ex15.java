package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		final double mile = 1.609;
		
		System.out.print("마일을 입력하세요: ");
		
		double m = sc.nextDouble();
		
		System.out.println(m+"마일은 "+m*mile+"킬로미터 입니다.");
		
		sc.close();
	}

}
