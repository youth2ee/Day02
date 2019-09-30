package com.naver.operator;

import java.util.Scanner;

public class Test {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("a값을 입력하시오");
		int a = sc.nextInt();
		
		a = 5;
		System.out.println(a);

		a = a+1;
		System.out.println(a);
		
		a = a*2;
		System.out.println(a);
		// 변수의 값은 계속 변한다. 
		
		System.out.println(a+0.25);
		//int값 a에 double값인 0.25를 더해서
		//a가 int보다 큰 double로 바뀜
		
		a = (int)a;
		System.out.println(a);
		//a를 다시 int형으로 바꾸기 위해서는 앞에 (int)를 붙여준다.
		
		
	}

}
