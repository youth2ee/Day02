package com.naver.operator;

import java.util.Scanner;

public class Operator_6 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int perMoney = 8350;
		int time = 0;
		int sum=0;
		
		
		System.out.println("일한시간을 입력하시오");
		time = sc.nextInt();

		//<나머지구하기>
		//1) 백단위 앞의 값을 찾아서 빼주기 : 몫을 이용하여 구하기
		sum = perMoney*time;
		
		int temp = sum/1000;
		temp=temp*1000;
		int result=sum-temp;
		
		//2) 나머지를 이용하여 구하기 (나머지 연산자 '%'를 이용하여 구하기)
		int sum2 = sum%1000;
		//% : 나머지 구하기 
		
		
		System.out.println(temp);
		System.out.println(result);
		System.out.println("급여 : "+sum+"원");
		System.out.println("기부금액 : "+sum2+"원");
		

	}

}
