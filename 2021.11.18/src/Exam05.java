import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		i = sc.nextInt();
		j = i % 2; 
		
		switch(j) {
			case 1:
				System.out.println("홀수입니다!");
				break;
				
			case 0:
				System.out.println("짝수입니다!");
				break;
		}

	}

}
