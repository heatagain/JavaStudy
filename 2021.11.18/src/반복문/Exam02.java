package �ݺ���;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		int i = 0;
		int user = 0;
		Scanner sc = new Scanner(System.in);

		while (i < 10) {

			System.out.print("���� �Է� : ");
			i = sc.nextInt();
			user++;
			System.out.println("�ݺ��� Ƚ�� :" + user);
			
			/* while(true){
			 * if(i>10) {	
				break; // �ش��ϴ� �ݺ��� ���� (�б⹮)
				}
			}*/
		}

		System.out.println("����Ǿ����ϴ�.");
		sc.close();
	}

}
