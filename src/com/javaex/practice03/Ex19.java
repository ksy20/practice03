package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4. 종료");
			System.out.println("-----------------------");
			
			
			
			System.out.print("선택> ");
			int choose = sc.nextInt();
			
			if (choose==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			else if (choose==1) {
				System.out.print("예금액> ");
				int money = sc.nextInt();
			}
			else if (choose==2) {
				System.out.print("출금액> ");
				int money2 = sc.nextInt();
			}
			
			else if (choose==3) {
				System.out.print("잔고액> ");
				int money3 = sc.nextInt();
			}
			
			else {
				System.out.println("다시 입력해주세요.");
			}
			
			
		}
		
		sc.close();

	}

}
