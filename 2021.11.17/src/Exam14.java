import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		i = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է� : ");
		j = sc.nextInt();
		
		k = i > j ? i - j : j - i;
		
		System.out.println("�� ���� �� : " + k);

	}

}
