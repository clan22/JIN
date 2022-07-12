package project_01;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		// 조건문
		
		//정수를 입력받아 20보다 크거나 같으면 "성인입니다"라고 
		//출력하는 프로그램 만들기
		
		//1. 입력받는 도구(Scanner) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		//2. 정수를 입력받아 age라는 int형 변수에 저장
		int age = sc.nextInt();
		
		//3. 만약, age가 20보다 크거나 같으면 "성인입니다" 출력
		//4. else age가 20보다 작으면 "미성년자입니다" 출력
		if(age >=20) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("미성년자입니다.");
		}

	}

}
