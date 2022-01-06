import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		
		int n;
		int b = 0;
		int k = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		n = sc.nextInt();
		
		b = (n % k) == 0 ? n / k : n / k + 1;
		
		System.out.println("필요한 상자의 수 : " +  b);
		
	}

}
