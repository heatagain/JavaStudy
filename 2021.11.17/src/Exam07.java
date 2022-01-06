import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >> ");
		int num = sc.nextInt();
		String result = num / 10 + "1";
		
		System.out.println("결과확인 : " + result);
		

	}

}
