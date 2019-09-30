package com.naver.v1;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main (String [] args) {
		//키보드와 연결준비
		Scanner sc = new Scanner(System.in);
		//scan쓰고  ctrl+스페이스 바
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요");
		double ki = sc.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double wei = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(ki);
		System.out.println(wei);
		
		
	}

}
