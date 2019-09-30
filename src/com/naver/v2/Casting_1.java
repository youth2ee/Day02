package com.naver.v2;

public class Casting_1 {
	public static void main (String [] args) {
		
		int number1 = 10;
		double number2 = 20.0;
		
		//<형변환>
		//number2 = number1; number1을 number2로 넣는다.
		
		number2 = number1; //number2 > number1
		//자동형변환 : number1이 int에서 double이 됨. (작은 것은 큰것이 될 수 있다.)
		//원칙적으로는 number2 = (double)number1;로 쓰는 것이 맞다.
		// 결론 : number1을 number2로 만들어준다. (오른쪽을 왼쪽으로 만든다.)
		
		number1 = (int)number2;
		//number1 = number2; 이건 안된다. 왜냐하면 서로 int는 4바이트고 double은 8바이트이므로 안된다.
		//따라서 double이 더 크므로 잘라서 넣어야 한다.
		//강제형변환 : 큰 것을 자른다. 소수점부분을 (int)표시로 잘라준다.
		
		System.out.println(number2);
		
		number2=15.234;
		number1=(int)number2;
		
		System.out.println(number1);
		
		long l =10L; //?
		float f =0.1F; //?
		float g =1; //?
		
		f=l;
		l=(long)f;
		
		number1 = 99;
		char ch = 'b';
		number1 = ch;
		System.out.println(number1);
		
		number1 = 65;
		ch = (char)number1;
		System.out.println(ch);
		
		//문자와 숫자 사이 형변환 가능
		
	}

}
