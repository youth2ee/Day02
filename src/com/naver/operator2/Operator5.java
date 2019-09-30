package com.naver.operator2;

import java.util.Scanner;

public class Operator5 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age=0;
		String result="";
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		//1) 성년미성년 판별하기
		//조건식?true일경우조건식:false일경우조건식
		result = age>=20?"성년":"미성년";
		//result = age>19?"성년":"미성년";
		System.out.println(result);
		
		//2) 10대인지 판별하기
		//논리연산자 &&(and)
		// 조건식 : 결과값이 true나 false
		result = age>=10 && age<20?"10대":"10대아님";
		System.out.println(result);

		
		
	}
}
