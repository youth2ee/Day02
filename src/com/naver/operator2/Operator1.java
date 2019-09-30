package com.naver.operator2;

public class Operator1 {

	public static void main(String [] args) {
		//논리연산자
		// and 연산자 : && (이항연산자) - 둘다 true여야 true
		boolean check1 = false;
		boolean check2 = false;
		boolean result = check1 && check2;
		System.out.println("and연산자 :"+result);
		
		// or 연산자 : || (이항연산자) - 둘 중 하나만 true여도 true
		boolean check3 = false;
		boolean check4 = true;
		boolean result2 = check3 || check4;
		System.out.println("or연산자 :"+result2);
		
		// !,~ (단항연산자) : 부정
		boolean check5 = true;
		boolean check6 = false;
		boolean result3 = check5 && check6;
		System.out.println("부정연산자 :"+result3);
		
		result3 = !result3;
		System.out.println(result3); 
		System.out.println(!result3);
	}
}
