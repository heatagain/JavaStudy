package ���ǹ�;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int time;
		int pay = 5000;
		int total;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ð��� �Է����ּ��� >> ");
		time = sc.nextInt();
		
		j = time - 8;
		
		if(time <= 8) {
			total = time * pay;
			
			System.out.println("�� �ñ� : "+ total + "��");
			
		}
		else {
			total = 8 * pay + 7500* j;
			
			System.out.println("�� �ñ� : " + total + "��");
		}

	}

}
