package com.naver.operator2;

public class Operator3 {
	
	public static void main(String [] args) {
		//비교연산자
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1>=num2; //num1이 num2보다 크거나 같습니까?
		System.out.println(result);
		
		result = num1<=num2; //num1이 num2보다 작거나 같습니까?
		System.out.println(result);
		
		result = num1==num2; //둘의 값이 같습니까?
		System.out.println(result);
		
		result = num1!=num2; //둘의 값이 같지 않습니까?
		System.out.println(result);
		
		char ch ='a';
		result = ch > num1;
		System.out.println((int)ch);
		System.out.println(result);
		// char와 int가 만날때
		// char타입은 자동으로 형변환이 되어 int가 된다. 
		// 따라서 결과값은 int가 된다.
		// 그러나 string타입은 형변환 안되므로 에러뜬다.

	}

}
