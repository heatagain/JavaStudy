import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {


		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		i = sc.nextInt();
		
		// int j = i ;
		// i/3
		// case 4,0
		// case 1
		// case 2
		// case 3
		
		switch(i) {
			case 12, 1, 2:
				System.out.println(i + "���� �ܿ��Դϴ�!");
				break;
			case 3, 4, 5:
				System.out.println(i + "���� ���Դϴ�!");
				break;
			case 6, 7, 8:
				System.out.println(i + "���� �����Դϴ�!");
				break;
			case 9, 10, 11:
				System.out.println(i + "���� �����Դϴ�!");
				break;
		}
		sc.close();
	}

}
