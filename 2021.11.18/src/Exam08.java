import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		i = sc.nextInt();
		
		
		
		System.out.println("�޴��� ������");
		System.out.print("1. �ݶ�(800��) 2. ����(500��) 3. ��Ÿ�ο���(1500��) >> ");
		j = sc.nextInt();
		
		/*
		if(j == 1) {
			i -= 800;
		}
		else if(j == 2) {
			i -= 500;
		}
		else if(j == 3) {
			i -= 1500;
		}*/
		
		int result = 0;
		
		
		switch(j) {      
			case 1 :
				/*if(i >= 800) {
					i -= 800;
				}
				else {
					System.out.println("���� �����ؿ�");
				}*/
				
				result = i - 800;
			break;
			
			case 2 :
				/*if(i >= 500) {
					i -= 500;
				}
				else {
					System.out.println("���� �����ؿ�");
				}*/
				result = i - 500;
				
			break;
			
			case 3 :
				/*if(i >= 1500) {
					i -= 1500;
				}
				else {
					System.out.println("���� �����ؿ�");
				}*/
				result = i - 1500;
			break;
				
			}
			
		if(result<0) {
			System.out.println("�� ����");
			System.out.println("�ܵ� : " + i + "��");
		}
		else {
			System.out.println("���ְ� �弼��");
			System.out.println("�ܵ� : " + result + "��");
		}
		//System.out.println("�ܵ� : " + i + "��");
	}

}
