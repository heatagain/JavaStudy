import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		i = sc.nextInt();
		
		if(i % 2 == 0 ) {
			System.out.println(i + "��(��) ¦���Դϴ�.");
			
		}
		else {
			System.out.println(i + "��(��) Ȧ���Դϴ�.");
		}
		
		sc.close();

	}

}
