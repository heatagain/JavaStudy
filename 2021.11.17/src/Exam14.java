import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		i = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		j = sc.nextInt();
		
		k = i > j ? i - j : j - i;
		
		System.out.println("두 수의 차 : " + k);

	}

}
