package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0; 
		
			
			if (num%2==0) {
			
				for (int o=1; o<=num; o++) {
					 if (o%2==0) {
						 sum = sum+o;
					 }
				 }
				System.out.println(sum);
				
			}
			else {
				for (int o=1; o<=num; o++) {
					 if (o%2!=0) {
						 sum = sum+o;
					 }
				 }
				System.out.println(sum);
			}
			

	
		
		
//		for (1번만 반복) {
//			if {2의 배수만 나오게
//				for {}
//			}
//			
//			if {홀수
//				for {}
//			}
//			sysout
//		}
		sc.close();	
	}
		

	}

