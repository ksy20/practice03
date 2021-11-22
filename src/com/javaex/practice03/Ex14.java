package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num= sc.nextInt();
		
		int sum=0;  //int i=1; //i<=num; 
		
		int i=1;
		
		while (i<=num) {
			
			for (int o=1; o<=1; o++) {
				
				for (int p=1; p<num; p++) {
					System.out.print(p+"+");
				}

				System.out.println(num);
			}
			
			i++;
			sum=num+i;
			
			
		}
	
		System.out.println("합계: " + sum);
		
//		System.out.println("합계: " + sum);
		
		sc.close();

	}

}
