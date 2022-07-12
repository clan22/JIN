package project_03;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		// 1. 입력받는 도구 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		//2. 정수를 입력받아 Scanner라는 int형 변수에 저장
		int score = sc.nextInt();
		
		//3. 만약, score가 90보다 크거나 같으면 "A학점입니다" 를 출력
		//score가 80보다 크거나 같고 90보다 작으면 "B학점입니다"를 출력
		//score >= 80 && score < 90 이지만 score >= 80만 써도 된다
		//맨 위의 if문 검증 후 아래로 내려오기 때문에 가능
		//score가 70보다 크거나 같고 80보다 작으면 "C학점입니다"를 출력
		//score가 70보다 작으면 "F학점입니다"를 출력

		
		if(score >= 90) {
			System.out.print("A학점입니다.");
		}else if(score >= 80){
			System.out.print("B학점입니다.");
		}else if(score >= 70) {
			System.out.print("C학점입니다.");
		}else {
			System.out.print("F학점입니다.");
		}
	}

}
