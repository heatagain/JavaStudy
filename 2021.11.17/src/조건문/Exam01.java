package ���ǹ�;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ���� ���߱�
		int answer = 10;
		int i;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� >> ");
		i = sc.nextInt();

		if (i == answer) {

			System.out.println("�����Դϴ�");
		} else
			System.out.println("���α׷� ����!");

	}

}
