import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int i;
		i = random.nextInt(10) + 1;
		int input = 0;

//		while (true) {
//			System.out.print("1~10 정수 입력 : ");
//			input = sc.nextInt();
//			cnt++;
//			if (input == i) {
//				break;
//			}
//
//		}
		
		do {
			System.out.print("1~10 정수 입력 : ");
			input = sc.nextInt();
			cnt++;
		} while(i!=input);

		System.out.println("랜덤 수 : " + i);
		System.out.println("정답 입력 수 : " + cnt);
		sc.close();
	}

}
