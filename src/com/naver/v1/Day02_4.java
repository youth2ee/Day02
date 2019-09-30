package com.naver.v1;

import java.util.Scanner;

public class Day02_4 {

	public static void main(String [] args) {
		//성적관리프로그램
		
		Scanner sc = new Scanner(System.in); 
		//Scan에서 반드시 대문자S여야 한다.
		
		//변수를 위에 선언해주는 것이 좋다. 아직 값은 모르므로 초기화 값은 기본값 넣어준다.
		// String의 기본값은 null, int의 기본값은 0, double의 기본값은 0.0
		String name=null;
		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		double avg=0;
		
		System.out.println("이름을 입력하세요");
		// String name = sc.next();	위에서 변수선언 안하면 변수선언을 동시에 해야함
		name = sc.next(); // 위에서 변수선언 했으므로 변수선언은 필요없다.
		//한글입력시에 커서를 반드시 내려서 해야한다.
		//영어는 입력시에 커서를 아래로 내리지 않아도 괜찮음.
		// String name = sc.nextLine();  띄어쓰기까지 입력가능
		
		System.out.println("국어성적을 입력하세요");
		//int kor = sc.nextInt();
		kor = sc.nextInt();
		
		System.out.println("영어성적을 입력하세요");
		//int eng = sc.nextInt();
		eng = sc.nextInt();
		
		System.out.println("수학성적을 입력하세요");
		//int math = sc.nextInt();
		math = sc.nextInt();
		
		//int sum = kor + eng + math;
		sum = kor + eng + math;
		
		//double avg = sum/3;
		avg = sum/3;
		//avg의 값을 double로 설정해줘도 int인 sum 나누기 int인 3을 나누니까 소수가 안나오고 정수만 나온다.
		
		System.out.println("Name : "+name);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		//연결연산자 이용
		
	}
}
