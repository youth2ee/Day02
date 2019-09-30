package com.naver.operator2;

public class Operator2 {
	public static void main (String [] args) {
		
		int count = 1;
		System.out.println(count);
		
		//누적함수 (자기 자신을 꺼내서 더하고 다시넣기. 많이 사용)
		count = count + 2; //3
		System.out.println(count);
		
		count = count + 3; //6
		System.out.println(count);
		
		count = count + 4; //10
		System.out.println(count);
		
		++count; //count의 값을 1 증가시켜라 => count = count + 1; //11
		System.out.println(count);
		
		count++; //count의 값을 1 증가시켜라 => count = count + 1; //12
		System.out.println(count);
		
		count=1; //초기화
		int result=0;
		
		result = ++count; // 더하고 보내기
		//count부터 증가시키고 result에 보내기
		System.out.println("=============");
		System.out.println("count : "+count);
		System.out.println("result : "+result);
		
		count=1; // 초기화
		result=0; // 초기화
		
		result = count++; // 보내고 더하기
		//count를 result에 보내고나서 count를 증가시킨다.
		System.out.println("=============");
		System.out.println("count : "+count);
		System.out.println("result : "+result);
		
		count=1;
		System.out.println(count++);
		// count를 프린트하고나서 count에 1을 더한다.
		System.out.println(count);
		// 따라서 count가 2가 된다.

	}

}
