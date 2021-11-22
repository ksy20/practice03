package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------");
		System.out.println("숫자게임 시작");
		System.out.println("---------");
		
		int num = 55;
		
		while (true) {
			 
			int num2 = sc.nextInt();
			
			if (num==num2) {
				System.out.println("맞았습니다");
				
				System.out.println("게임을 종료하겠습니까?");
				char y = sc.next().charAt(0);
				
				if (y=='y') {
					System.out.println("---------");
					System.out.println("숫자게임 종료");
					System.out.println("---------");
					break;
				}
				
			}
			
			else if (num2>num) {
				System.out.println("더 낮게");
			}
			else {
				System.out.println("더 높게");
			}
			
			
		}
		
		sc.close();

	}

}
