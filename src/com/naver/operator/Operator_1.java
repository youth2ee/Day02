package com.naver.operator;

public class Operator_1 {
	
	public static void main(String [] args) {
		
		int num1 = 10;
		int num2 = 3;
		int result = num1/num2; //몫을 구하는 연산자 : 3
		int result2 = num1%num2; //나머지를 구하는 연산자 : 1
		
		
		System.out.println(result); //3
		System.out.println(result2); //1 
		
		System.out.println(3+1.2); //4.2
		// int + double
		// 같은 데이터 타입이 아닌경우 ,
		// 큰데이터타입으로 자동으로 바뀐다. int는 double로 바뀐다. 
		// 결국 둘의 데이터타입이 다른경우, 
		// 둘 중 큰 데이터타입으로 바뀌고나서 연산된다.
		
		int sum = (int)3.2+6;
		// int sum = (int)(3.2+6)
		sum = (int)(3.2+5.2);
		
		//3.2는 double, 6은 int 다른 형이므로 6은 double로 바뀐다.
		//따라서 결과값을 int로 바꾸기 위해서는 
		//3.2를 int로 바꾸거나
		//전체값을 int로 바꾼다.
		
	}

}
