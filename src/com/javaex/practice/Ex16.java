package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품가격: ");
		
		double p = sc.nextDouble();
		
		System.out.print("받은돈: ");
		
		double c = sc.nextDouble();
		
		System.out.println("=====================");
		System.out.println("받은돈: "+c);
		System.out.println("상품가격: "+p);
		System.out.println("부가세: "+p/10);
		System.out.println("잔액: "+(c-p));
		
		sc.close();
		
		
	}

}
