import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		i = sc.nextInt();
		j = i % 2; 
		
		switch(j) {
			case 1:
				System.out.println("Ȧ���Դϴ�!");
				break;
				
			case 0:
				System.out.println("¦���Դϴ�!");
				break;
		}

	}

}
