package project_01;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		// ���ǹ�
		
		//������ �Է¹޾� 20���� ũ�ų� ������ "�����Դϴ�"��� 
		//����ϴ� ���α׷� �����
		
		//1. �Է¹޴� ����(Scanner) ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		//2. ������ �Է¹޾� age��� int�� ������ ����
		int age = sc.nextInt();
		
		//3. ����, age�� 20���� ũ�ų� ������ "�����Դϴ�" ���
		//4. else age�� 20���� ������ "�̼������Դϴ�" ���
		if(age >=20) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�̼������Դϴ�.");
		}

	}

}
