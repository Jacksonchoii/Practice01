package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		long l = 300000L;
		
		long d = l*60*60*24*365L;
		System.out.println("빛이 1년 동안 가는 거리는 "+d+" km 입니다.");
		
		sc.close();
		
	}

}
