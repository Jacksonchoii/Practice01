package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		double r = sc.nextDouble();
		
		System.out.println("구의부피는: "+(double)4/3*Pi*(r*r*r));
		
		sc.close();
	}

}
