package ���ǹ�;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		int num;
		int temp;
		int temp2;
		int temp3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		temp = num % 10;
		temp2 = num - temp;
		temp3 = 10 - temp;
		/*
		 * if(num%10 >= 5) {
		 * 
		 * system~~((num+10) - num%10)
		 * }
		 * else{
		 * sys~(num-(num%10))
		 * 
		 * }
		 * 
		 */
		if(temp >= 5) {
			num += temp3;
			System.out.println("�ݿø� �� : "+ num);
			
		}
		else {
			num = temp2;
			System.out.println("�ݿø� �� : " + num);
			
		}
		
		

	}

}
