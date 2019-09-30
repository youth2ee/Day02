package com.naver.operator2;

public class Operator6 {
	
	public static void main(String [] args) {
		
		//복합대입연산자
		int num =0;
		num+=3; // 같은의미 : num = num+3;
		num*=2;// 같은의미 : num = num*2;
		System.out.println(num);
		
		int count =2;
		num = count+2; 
		// 이경우는 위처럼 못만든다. 변수가 num, count 2개이므로 불가
		
		
		
		
	}

}
