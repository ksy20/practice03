package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int i=1; int fac = 1;
	    for (i= 1; i<=num; i++) {
	    	fac=fac*i;
	    	
	    	
	    }
		
	    System.out.println("결과값: "+fac);
				
		sc.close();

	}

}
