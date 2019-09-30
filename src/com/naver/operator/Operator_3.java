package com.naver.operator;

import java.util.Scanner;

public class Operator_3 {
	
	 public static void main (String [] args) {
		 Scanner sc = new Scanner(System.in);
		 
		double wei=0.0;
		double hei=0.0;
		double area=0.0;
		double side=0.0;
		//double의 기본값은 0.0

		System.out.println("가로의 길이를 입력하세요");
		wei = sc.nextDouble(); //wei는 double타입이므로 nextDouble
		
		System.out.println("세로의 길이를 입력하세요");
		hei = sc.nextDouble();
		
		area = wei*hei;
		side = (wei+hei)*2;
		
		System.out.println("면적 : "+area);
		System.out.println("둘레 : "+side);
		
		
		 //가로, 세로 값을 실수형으로 키보드로부터 입력받아서 
		 //사각형의 면적과 둘레를 계산하세요
		 //결과
		 //면적 : 가로*세로
		 //둘레 : (가로+세로)*2
		 
		 
	 }

}
