package com.naver.v1;

public class Day02_1 {

		public static void main(String [] args) {
			
		// 학교 성적관리 프로그램
		// 학생의 이름
		// 국어, 영어, 수학
		// 총점 계산
		// 평균 계산
		// 학생이름 출력
		// 총점 출력
		// 평균 출력
			
		//변수선언공식 : 데이터타입 변수명;
			
		//학생의 이름을 담는 변수를 설정
		    String name = "이가영";
		
		//국어점수를 담는 변수 선언 및 초기화 , 95는 literal이라고 한다.
			int kor = 95;
		//영어점수를 담는 변수 선언 및 초기화
			int eng = 75;
		//수학점수를 담는 변수 선언 및 초기화
			int math = 65;
		
		//띄어쓰기는 상관없다. int kor=95; int kor = 95;
						
		//총점을 담을 변수를 선언,평균을 담을 변수를 선언
		int sum = kor + eng + math; //sum값은 계산식이므로 literal 아니다.
		int avg = sum/3;
		
		System.out.println(name);
		System.out.println(sum);
		System.out.println(avg);
		
		}
}
