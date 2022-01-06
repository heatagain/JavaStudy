package 반복문;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		int i = 0;
		int user = 0;
		Scanner sc = new Scanner(System.in);

		while (i < 10) {

			System.out.print("정수 입력 : ");
			i = sc.nextInt();
			user++;
			System.out.println("반복한 횟수 :" + user);
			
			/* while(true){
			 * if(i>10) {	
				break; // 해당하는 반복문 종료 (분기문)
				}
			}*/
		}

		System.out.println("종료되었습니다.");
		sc.close();
	}

}
