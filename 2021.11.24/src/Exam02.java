import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		int[] array = new int[5];
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 >> ");
			array[i] = sc.nextInt();
		}
		for (i = 0; i < 5; i++) {
			System.out.print(array[i] + " : ");
			for(j = 1; j <= array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
						
		}
		sc.close();
	}

}
