package �ݺ���;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		
		while(k != -1) {
			
			System.out.print("�����Է� : ");
			k = sc.nextInt();
			
			if(k % 2 == 0) {
			i++;
			}
			else {
			j++;
			}
			
			if(k != -1) {
			System.out.println("¦������ : " + i);
			System.out.println("Ȧ������ : " + j);
			}
		}
		System.out.println("����Ǿ����ϴ�.");
		sc.close();
	}

}
