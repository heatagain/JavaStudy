import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {

		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� : ");
		i = sc.nextInt();
		j = i % 2;
		
		System.out.println((j == 0) ? "¦��" : "Ȧ��" );
		

	}

}
