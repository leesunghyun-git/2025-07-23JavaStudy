


/*
 *  	1. 연산자 (목표) => 단항연산자 / 이항연산자 (산술연산자)
 *  		1) 기본 : 변수 / 연산 / 제어
 *  		2) 데이터를 묶어서 사용 
 *  		   ----------------
 *  			같은 데이터 : 배열
 *  			*** 다른 데이터 : 객체 
 *  		3) 관련된 명령문 : 기능
 *  		   게시판 => 목록출력 / 글쓰기 / 상세보기 / 수정 / 삭제 
 *  		   => 기능 (메소드)
 *  		   => 재사용이 가능
 *  		   => 기능 추가 => 답변 / 수정 => 목록 (이미지)	
 *    2025-07-22정리
 *    -------------
 *    1. 자바실행 과정
 *    	=> 클래스명과 파일저장명이 동일 (대소문자 구분)
 *    	   class MainClass => mainClass.java
 *    			 ---------    --------- 
 *    				|			  |
 *    				--------------- 일치
 *    	 => EditPlus / 울투라Edit 
 *    	 => A.java ========= A.class ========= 실행
 *    		 원시소스			 바이트코드(0,1)
 *					  |				     |
 *					javac              java
 *					컴파일			   인터프리터
 *				  (컴퓨터언어로 변경)	  (한줄씩 읽어서 출력)
 *				 	  |					  |
 *    				컴파일영역            실행시
 *                -------문법            입력값
 *                 => 프로그래머 실수       사용자
 *     => 프로그램 개발 => 다시 사용해야되는 데이터
 *     				   ------------------- 메모리에 저장 (변수)
 *     변수 : 한개의 데이터만 저장하는 메모리 공간의 이름
 *     							    ----- 주소값
 *     변수를 사용
 *     -------- 메모리 크기
 *              --------- 데이터형 / 자료형
 *     정수
 *     	 byte (-128~127) => 8bit => 1byte
 *       int  (-21억4천 7백~21억4천 7백) => 32bit => 4byte
 *       ======= 기본 : 컴퓨터는 모든 정수를 int로 인식
 *       long => 64bit => 8byte
 *     실수
 *     	 double => 8byte => 소수점 15자리
 *       => 기본
 *     문자
 *       문자 한개만 저장 => 0~65535 (각국의 언어사용이 가능)
 *       char => 표현식 ''
 *     논리
 *     	 제어문 / 연산자 (비교연산자 , 부정연산 , 논리연산자 )
 *     문자열
 *       String : 일반 데이터형 / 참조 데이터형
 *       ------- 기능 
 *    ---------------------------------------------------------------------
 *    변수 선언 : 변수는 반드시 초기값을 첨부
 *    --- 변경이 가능 , 상수 : 변경이 불가능
 *        데이터형 변수, final 데이터형 변수
 *                   ------ 상수
 *    1. 선언
 *    	 값 저장
 *    2. 선언과 동시에 값을 부여
 *    	 데이터형 변수명=값
 *    				--- 리터럴
 *       int a=10 
 *       --- - --
 *  -------------------------------------------------------------------
 *   정수 표현법
 *   	=> 10, 20... (10진법)
 *   	=> 0b11100 , 0B => (2진법)
 *      => 0123 => 8진법
 *      => 0x, 0X => 16진법
 *   문자 표현법
 *     'A' , '흥'
 *   문자열 표현
 *     "ABC..."
 *     문장이 길 경우
 *     """
 *       문장
 *     """
 *     
 *  ------------------------------------------- 형변환 / 문자열 => 60page
 *  형변환
 *   자동형변환
 *     = 변수에 값대입
 *       int a='A'
 *             ---- char => int (65)
 *       byte < char < int < long < double 
 *       
 *     = 연산처리 (데이터형이 동일 => 연산)
 *       int + int => int
 *       long + int => long
 *             ----- long 변환
 *        10 + 'A'
 *        int char
 *            ----
 *             65
 *        -------------> 75
 *        double + long + int + char = double     
 *        char + char = int
 *        byte + byte = int
 *        char + byte = int
 *        int 이하 데이터 (byte,char, short)
 *        			  ---------------------- 연산처리 => int 
 *        
 *        결과값 int => int /long /float / double
 *        결과값 long => long/float/double
 *        결과값 float => float/double
 *        결과값 double => double
 *        
 *   강제형변환 : 많이 나온다
 *           ------------- 연산처리(X) => 객체
 *       		인간
 *       		 |
 *       	-----------
 *       	|		  |
 *         남자       여자
 *         
 *         인간 a=남자 => is-1
 *         남자 a=(남자)인간
 *         
 *      => 강제형변환
 *         (데이터형)값
 *         ----------
 *         | => 큰데이터형 변경 => UpCasting
 *         | => 작은데이터형 변경 => DownCasting
 *      
 *      	(double)10 => 10.0
 *      	(int) 'A' => 65
 *      	
 *      	(char)65 => 'A'
 *      	(int)10.5 => 10
 *      
 *      	**boolean은 변환이 안된다
 *      
 *      	String : 모든 데이터형을 문자열로 변환
 *      	int => String => int
 *      	-------------
 *      	String.valueof(10) => "10"
 *      						Integer.parseInt("10") => 10 
 *      	long => String => long
 *      	String.valueof(10L) => "10"
 *      						Long.parseLong("10") => 10L 
 *      	double => String => double
 *      	String.valueof(10.5) => "10.5"
 *      						double.parseDouble("10.5") => 10.5 
 *      	boolean => String => boolean
 *      						boolean.prasBoolean("true") => true
 *      	String.valueof(true) => "true"
 *       	=> 각데이터형을 쉽게 사용할 수 있게
 *       	   클래스화 => Wrapper
 *       	   int => Integer
 *       	   long => Long
 *       	   double => Double
 *       	   boolean => Boolean
 *       	   --- 
 *  	   
 *  	** 윈도우 개발 / 웹 개발 => 데이터는 String
 *  	-----------------------------------------------
 *  	<input type="text">
 *  	JTextField
 *      -----------------------------------------------
 *      
 *      입출력
 *      System.out.println() : 가장많이 사용
 *      ---------------------> 웹 => 입력값 확인 , 오류 메시지 출력
 *      사용을 하면 => 줄바꿈
 *      System.out.print() : 문법 사항 => 줄바꿈이 안된다
 *      					가로로 출력 => 한명에 대한 데이터 출력
 *      System.out.printf() : 출력 서식을 만들어서 출력
 *      -----------------------C언어에서 주로 사용 
 *      printf("서식",값...)
 *      	   ----
 *      	   정수값 : %d
 *       			  --- 정렬
 *       			  왼쪽 / 오른쪽
 *       			  %-3d   %3d
 *       			  90
 *       			 %-5d
 *       								
 *       		9 0 	          9 0
 *       		_ _ _ _ _   _ _ _ _ _
 *       
 *       	  실수값 : %f
 *       			%.2f => 소수점 2자리
 *       			%.3f => 소수점 3자리
 *       			%.1f => 소수점 1자리
 *       
 *       	  문자 : %c
 *       	  문자열 : %s
 *       
 *           *** 특수문자
 *           \n : 줄바꿈
 *           \t : 일정 간격
 *           \" : " 출력 => html 전송시에 주로 사용
 *           \\ : \ 출력 => 경로명
 *      -----------------------
 *      Scanner 
 *		------- 클래스화 => 키보드 입력값 
 *		Scanner scan = new Scanner(System.in)
 *		------- ----   ---         --------- 키보드 입력값
 *               변수   저장 
 *		사용자 정의 데이터형
 * 	
 *  	1. 정수   => scan.nextInt()
 *  	2. 실수   => scan.nextDouble()
 *  	3. 논리	 => scan.nextBoolean()
 *  	4. 문자열  => scan.next.()
 *  
 *  	입력 : 공백 => 메모리에 저장 => 엔터
 *      
 */
import java.util.Scanner;
/*
 *  class Scanner
 *  {
 *  }
 *  
 *  => include <stdio.h> (
 *  => using (C#)
 *  => import (python,react...)
 */ 

public class 자동형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println((byte)-127);
//		자동형변환 a=new 자동형변환();
//		System.out.println(a);
//
//		자동형변환 b=new 자동형변환();
//		System.out.println(b);
//		byte b1=10;
//		byte b2=20;
//		byte b3=(byte)(b1+b2);
//		// byte => int / long / double / float / short \
//		System.out.printf("%3d%3d%3d\n",10,20,30);
//		System.out.printf("%.1f\n",10/3.0);
//		System.out.printf("%08d\n",6);
//		System.out.printf("%c",'홍');
//		System.out.printf("%s","홍길동이 나타났다.");
		
		Scanner scan= new Scanner(System.in);
//		System.out.print("국어 점수:");
//		int kor=scan.nextInt();
//		System.out.print("영어 점수:");
//		int eng=scan.nextInt();
//		System.out.print("수학 점수:");
//		int math=scan.nextInt();
//		
//		System.out.printf("%3d%3d%3d",kor,eng,math);
//		System.out.print("국어 영어 수학입력(90 90 90):");
//		int kor=scan.nextInt(); 
//		int eng=scan.nextInt();
//		int math=scan.nextInt(); //한번에 입력값 받기
//		System.out.printf("%4d%4d%4d",kor,eng,math);
		//System.out.print("문자열 입력:");
		//String msg=scan.nextLine(); //공백 포함
		// String msg=scan.next(); // 공백 이전까지만
		//System.out.println(msg);
//		System.out.print("true/false입력:");
//		boolean b=scan.nextBoolean();
//		System.out.println(b); 
		System.out.println("실수 입력:");
		double d=scan.nextDouble();
		System.out.println(d);
	
		
		
	}

}
