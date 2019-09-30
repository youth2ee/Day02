package com.naver.operator;

import java.util.Scanner;

public class Operator_7 {
	
	public static void main (String [] args) {
		
		//무인편의점에 들어가는 프로그램
		//물건의 합계
		//손님이 낸돈
		//잔돈
		//만원짜리 몇장, 천원짜리 몇장, 백원짜리 몇개, 십원 몇개
		
		int price = 0; //물건의 합계
		int cus =0; //손님이 낸돈
		int rest=0; //잔돈
		int mil=0; //만원짜리
		int tho=0; //천원짜리
		int hun=0; //백원짜리
		int ten=0; //십원짜리

		Scanner sc = new Scanner(System.in);
		System.out.println("물건의 합계");
		price = sc.nextInt();
		
		System.out.println("손님이 낸돈");
		cus = sc.nextInt();
		
		rest = cus-price;
		System.out.println("잔돈 : "+rest+"원");

		//1)
		/*
		mil = rest/10000;
		tho = (rest-mil*10000)/1000;
		hun = (rest-(mil*10000+tho*1000))/100;
		ten = (rest-(mil*10000+tho*1000+hun*100))/10;
		
		System.out.println("만원 : "+mil+"장");
		System.out.println("천원 : "+tho+"장");
		System.out.println("백원 : "+hun+"개");
		System.out.println("십원 : "+ten+"개");
		*/
		
		//2)
		/*
		mil = rest/10000;
		tho = (rest%10000)/1000;
		hun = (rest%1000)/100;
		ten = (rest%100)/10;
		
		System.out.println("만원 : "+mil+"장");
		System.out.println("천원 : "+tho+"장");
		System.out.println("백원 : "+hun+"개");
		System.out.println("십원 : "+ten+"개");
		*/
		
		//3)
		/*
		mil = rest/10000;
		tho = rest/1000 - mil*10; 
		hun = rest/100 - (mil*100 + tho*10);
		ten = rest/10 - (mil*1000 + tho*100 + hun*10);
		
		System.out.println("만원 : "+mil+"장");
		System.out.println("천원 : "+tho+"장");
		System.out.println("백원 : "+hun+"개");
		System.out.println("십원 : "+ten+"개");
		*/
		
		//4)
		mil = rest/10000;
		tho = (rest/1000)%10; 
		hun = (rest/100)%10;
		ten = (rest/10)%10;
		
		System.out.println(rest/1000);
		System.out.println(rest/100);
		System.out.println(rest/10);

		System.out.println("만원 : "+mil+"장");
		System.out.println("천원 : "+tho+"장");
		System.out.println("백원 : "+hun+"개");
		System.out.println("십원 : "+ten+"개");
		  
	
	}

}
