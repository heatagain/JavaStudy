package 반복문;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 1;
		int l = 0;
		Scanner sc = new Scanner(System.in);
		
		while(k != 0) {
			
			System.out.print("A 입력 >> ");
			i = sc.nextInt();
			
			System.out.print("B 입력 >> ");
			j = sc.nextInt();
			
			l = i - j;
			k = i + j;
			System.out.println("결과 >> " + l);
			
		}
		
		/*int i = 1;
		int j = 1;
		// 항상 조건식 >> boolean 타입만 와야한다
		while(ture) {
			System.out.print("A 입력 >> ");
			i = sc.nextInt();
			
			System.out.print("B 입력 >> ");
			j = sc.nextInt();
			
			if(i == 0 && j == 0) {
			break;
			}
			
			syso("결과 : " + (num1-num2));
			
			
		}*/
		
		
	}

}
