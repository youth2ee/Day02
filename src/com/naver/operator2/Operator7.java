package com.naver.operator2;

import java.util.Scanner;

public class Operator7 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int input = sc.nextInt();
	
		//수식작성
		// 0 -> 0 0
		// 1 -> 1 0
		// 2 -> 2 0
		// 3 -> 3 0
		
		// 4 -> 10 6
		// 5 -> 11 6
		// 6 -> 12 6
		// 7 -> 13 6
		
		// 8 -> 20 12
		// 9 -> 21 12

		int output = 0;

		//output = output+(input/4)*6;
		output = input/4*10 + input%4;
		
		System.out.println(output);
		
	}

}
