package 조건문;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int time;
		int pay = 5000;
		int total;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력해주세요 >> ");
		time = sc.nextInt();
		
		j = time - 8;
		
		if(time <= 8) {
			total = time * pay;
			
			System.out.println("총 시급 : "+ total + "원");
			
		}
		else {
			total = 8 * pay + 7500* j;
			
			System.out.println("총 시급 : " + total + "원");
		}

	}

}
