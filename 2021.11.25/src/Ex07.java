import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int input;
		int h = 0;
		int j = 0;
		
		for(i = 1; i <= 5; i++) {
			input = sc.nextInt();
			if(input % 2 == 0) {
				j++;
			} else {
				h++;
			}
			System.out.println("Ȧ�� ���� : " + h);
			System.out.println("¦�� ���� : " + j);
			
		}
		sc.close();
	}

}
