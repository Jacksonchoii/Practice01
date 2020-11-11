package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int qfh = sc.nextInt();
		int fh = 500;
		
		System.out.print("100원 개수: ");
		int qh = sc.nextInt();
		int h = 100;
		
		System.out.print("50원 개수: ");
		int qff = sc.nextInt();
		int ff = 50;
		
		System.out.print("10원 개수: ");
		int qt = sc.nextInt();
		int t = 10;
		
		int Total = (qfh*fh)+(qh*h)+(qff*ff)+(qt*t);
		System.out.println("동전의 총합은 "+Total+" 원 입니다.");
		
		sc.close();
		
		
		
		
	}

}
