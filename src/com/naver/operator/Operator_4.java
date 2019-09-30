package com.naver.operator;

import java.util.Scanner;

public class Operator_4 {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		double tax1 =1.2*0.01;
		double tax2=0.8*0.01;
		double tax3=0.5*0.01;
		double tax4=1.7*0.01;
		double total=0.0;

		System.out.println("월급을 입력하세요");
		money = sc.nextInt();
		
		// total = money-(money*(tax1+tax2+tax3+tax4));	
		
		double r1 = money*tax1;
		double r2 = money*tax2;
		double r3 = money*tax3;
		double r4 = money*tax4;
		
		/*
		total = money - (r1+r2+r3+r4);
		
		System.out.println("국민연금 : "+(int)r1+"원");
		System.out.println("의료보험 : "+(int)r2+"원");
		System.out.println("산재보험 : "+(int)r3+"원");
		System.out.println("고용보험 : "+(int)r4+"원");
		System.out.println("세금 : "+(int)(money-total)+"원");
		System.out.println("실수령액 : "+(int)total+"원");
		*/
		
		//2-1)
		/* total의 값이 계속 변한다. 마지막 total 값 사용
		total = money-money*0.012;
		total = total-total*0.008;
		total = total-total*0.005;
		total = total-total*0.017;
		*/
		
		//2-2) 비율에 변수를 적용하여 사용
		/* total의 값이 계속 변한다. 마지막 total 값 사용
		total = money-r1;
		total = total-r2;
		total = total-r3;
		total = total-r4;
		 */
		
		//3-1)
		//total = money-((money*(0.012+0.008+0.005+0.017)));
		
		//3-2)
		total = money-((money*(r1+r2+r3+r4)));
		
		System.out.println("실수령액 : "+(int)total+"원");
		
	
		//월급을 입력하세요
		//실수령액계산하기
		//국민연금1.2% , 의료보험0.8%, 산재보험0.5%, 고용보험1.7%
		//출력 실수령액
		
	}
	
}
