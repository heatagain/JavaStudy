package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {
		
		MyKart spotage = new MyKart();
		// ù �������� 0! -> spotage.myposition -> 0
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		
		for(int o = 0; o < 100; o++) {
			str[o] = "_";
		}
		
		while(spotage.myposition < 100) {
			System.out.println("1.���� 2.���� 3.�ν���");
		//	System.out.println("���� ��ġ : " + spotage.myposition );
			for(int o = 0; o < 100; o++) {
				System.out.print(str[o]);
			}
			System.out.println();
			System.out.println();
			System.out.println();
			
			int i = spotage.myposition;
			
			int menu = sc.nextInt();
			if(menu == 1) {
				// ���� ��ġ�� 10��ŭ ������ ������
				spotage.go(10);
				i = i + 10;
				for(int k = 0; k < spotage.myposition; k++) {
					str[k] = "*";
				}
			}
			else if(menu == 2) {
				// ���� ��ġ�� 10��ŭ �ڷ� ������
				if(spotage.myposition > 0) {
					spotage.back(10);
					
					for(int k = i; k >= spotage.myposition; k--) {
						str[k] = "_";
					}
					i = i - 10;
				}
			}
			else if(menu == 3) {
				// ���� ��ġ�� 30������ ������
				spotage.booster(30);
				i = i + 30;
				for(int k = 0; k < spotage.myposition; k++) {
					str[k] = "*";
				}
			}
		}
		System.out.println("����~ ���� ��");
	}

}
