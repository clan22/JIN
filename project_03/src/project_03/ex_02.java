package project_03;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		// 1. �Է¹޴� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		//2. ������ �Է¹޾� Scanner��� int�� ������ ����
		int score = sc.nextInt();
		
		//3. ����, score�� 90���� ũ�ų� ������ "A�����Դϴ�" �� ���
		//score�� 80���� ũ�ų� ���� 90���� ������ "B�����Դϴ�"�� ���
		//score >= 80 && score < 90 ������ score >= 80�� �ᵵ �ȴ�
		//�� ���� if�� ���� �� �Ʒ��� �������� ������ ����
		//score�� 70���� ũ�ų� ���� 80���� ������ "C�����Դϴ�"�� ���
		//score�� 70���� ������ "F�����Դϴ�"�� ���

		
		if(score >= 90) {
			System.out.print("A�����Դϴ�.");
		}else if(score >= 80){
			System.out.print("B�����Դϴ�.");
		}else if(score >= 70) {
			System.out.print("C�����Դϴ�.");
		}else {
			System.out.print("F�����Դϴ�.");
		}
	}

}
