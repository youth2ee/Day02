package com.naver.v2;

public class Casting_2 {
	
	public static void main(String [] args) {
		
		int num1 = 5;
		int num2 = 6;
		int sum = num1+num2;
		
		//double avg = (double)(sum/2);
		//이미 int/int가 되었으므로 double로 바꿔도 int

		
		double avg = (double)sum/2;
		avg = sum/(double)2;
		// int인 sum과 int인 2 값 중 하나만 double로 바꿔도 
		// double이 더 크므로 나머지 하나도 double로 바뀐다.
		
		avg = sum/2.0;
		// int값인 2를 double값인 2.0으로 바꿔주면
		// int값인 sum이 자동으로 double로 바뀐다.
		
	
		System.out.println(avg);
		
		
		
	}

}
