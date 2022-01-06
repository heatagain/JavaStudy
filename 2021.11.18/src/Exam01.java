import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		i = sc.nextInt();
		
		if(i % 2 == 0 ) {
			System.out.println(i + "는(은) 짝수입니다.");
			
		}
		else {
			System.out.println(i + "는(은) 홀수입니다.");
		}
		
		sc.close();

	}

}
