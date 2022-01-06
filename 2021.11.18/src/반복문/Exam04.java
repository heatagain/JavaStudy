package 반복문;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		
		while(k != -1) {
			
			System.out.print("숫자입력 : ");
			k = sc.nextInt();
			
			if(k % 2 == 0) {
			i++;
			}
			else {
			j++;
			}
			
			if(k != -1) {
			System.out.println("짝수개수 : " + i);
			System.out.println("홀수개수 : " + j);
			}
		}
		System.out.println("종료되었습니다.");
		sc.close();
	}

}
