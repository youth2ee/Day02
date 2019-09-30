package com.naver.operator;

import java.util.Scanner;

public class Operator_5 {
	
	public static void main(String [] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 int money =0;
		 double r1 =10*0.01;
		 double r2 =10*0.01;
		 
		 System.out.println("물건값을 입력하세요");
		 money = sc.nextInt();
		 
		 double result=0.0;
		 result = money-(money*r1);
		 result = result-(result*r2);
		 
		 System.out.println("물건가격 : "+money+"원");
		 System.out.println("할인가격 : "+(int)(money-result)+"원");
		 System.out.println("할인된 가격 : "+(int)result+"원");

		
	}

}
