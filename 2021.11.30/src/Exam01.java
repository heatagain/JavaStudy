import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		
		int result = LargerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);
		
		sc.close();

	}
	
	public static int LargerNumbers(int x1, int x2) {
		
//		if(x1 > x2) {
//			return x1;
//		} else if(x1 < x2) {
//			return x2;
//		} else {
//			return 0;
//		}
		
		return x1 != x2 ? (x1 > x2 ? x1 : x2) : 0;
		
	}

}
