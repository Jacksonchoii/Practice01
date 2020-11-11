package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final float Pi = 3.14f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		
		
		float circle = sc.nextFloat();
		
		System.out.println("원의 넓이는 "+(Pi*circle*circle));
		
		sc.close();
		
	}

}
