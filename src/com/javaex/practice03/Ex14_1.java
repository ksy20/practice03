package com.javaex.practice03;

import java.util.Scanner;

public class Ex14_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum=0;
		
		for (int i=1; i <num; i++) {
			
			for (int p=1; p<=1; p++) {
				
				System.out.print(i+"+");
			}
			
			sum= sum+i;
		}
		System.out.println(num);
		
		System.out.println("합계: "+(sum+num));
		sc.close();

	}

}
