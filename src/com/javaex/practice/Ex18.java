package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		
		double f = sc.nextDouble();
		
		double ff = (double)5/9 * (f-32);
		System.out.println("화씨 "+f+" 의 섭씨온도는 "+ff+" 입니다.");
		
		sc.close();
	}

}
