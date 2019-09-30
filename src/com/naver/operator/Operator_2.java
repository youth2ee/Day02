package com.naver.operator;

public class Operator_2 {

	public static void main(String [] args) {
		
		System.out.println(1+1); //2
		// 산술연산자 + : int + int
		
		System.out.println('1'+1); //50
		// 산술연산자 + : char + int (char타입(2byte)이 int타입(4byte)으로 바뀐다.)
		
		System.out.println("1"+1); //11
		// 연결연산자 + : String + int
		// 형변환은 primitive 타입만 가능
		// string은 Reference 타입이므로 형변환 불가
		// String(reference 타입이므로 string과 int가 붙으면 string된다.)
		
		String result = "1"+1;
		
		System.out.println("1"+1+1); //111
		//string + int + int = string
		//형변환 안한다. string과 int가 붙어서 string이고, 이 string에 int가 또 붙어서 string 111이 탄생. 
		
		System.out.println("1"+(1+1)); //12
		//String + (int + int)
		// = String + int(2) = String
		
		System.out.println("1"+'1'); //11
		//String + char : char이 string이 된다.
		//string 11
		
		System.out.println('1'+1+"1"); //501
		//char + int + String
		//char로서의 1 값은 49
		//char랑 int가 먼저 계산되어서 int 50. 거기에 string으로 1이 붙어
		//string 501탄생
		

	}
}
