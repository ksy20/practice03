package com.javaex.practice03;

public class Ex05 {

	public static void main(String[] args) {
		//i=i+1->밑에 있어서 안먹음 5>= 끝남 
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			
			System.out.println(i);
			i=i+1;
		}

	}

}
