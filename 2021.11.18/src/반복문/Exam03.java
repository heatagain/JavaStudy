package �ݺ���;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 1;
		int l = 0;
		Scanner sc = new Scanner(System.in);
		
		while(k != 0) {
			
			System.out.print("A �Է� >> ");
			i = sc.nextInt();
			
			System.out.print("B �Է� >> ");
			j = sc.nextInt();
			
			l = i - j;
			k = i + j;
			System.out.println("��� >> " + l);
			
		}
		
		/*int i = 1;
		int j = 1;
		// �׻� ���ǽ� >> boolean Ÿ�Ը� �;��Ѵ�
		while(ture) {
			System.out.print("A �Է� >> ");
			i = sc.nextInt();
			
			System.out.print("B �Է� >> ");
			j = sc.nextInt();
			
			if(i == 0 && j == 0) {
			break;
			}
			
			syso("��� : " + (num1-num2));
			
			
		}*/
		
		
	}

}
