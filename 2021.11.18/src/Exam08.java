import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
		i = sc.nextInt();
		
		
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >> ");
		j = sc.nextInt();
		
		/*
		if(j == 1) {
			i -= 800;
		}
		else if(j == 2) {
			i -= 500;
		}
		else if(j == 3) {
			i -= 1500;
		}*/
		
		int result = 0;
		
		
		switch(j) {      
			case 1 :
				/*if(i >= 800) {
					i -= 800;
				}
				else {
					System.out.println("돈이 부족해요");
				}*/
				
				result = i - 800;
			break;
			
			case 2 :
				/*if(i >= 500) {
					i -= 500;
				}
				else {
					System.out.println("돈이 부족해요");
				}*/
				result = i - 500;
				
			break;
			
			case 3 :
				/*if(i >= 1500) {
					i -= 1500;
				}
				else {
					System.out.println("돈이 부족해요");
				}*/
				result = i - 1500;
			break;
				
			}
			
		if(result<0) {
			System.out.println("돈 없음");
			System.out.println("잔돈 : " + i + "원");
		}
		else {
			System.out.println("맛있게 드세요");
			System.out.println("잔돈 : " + result + "원");
		}
		//System.out.println("잔돈 : " + i + "원");
	}

}
