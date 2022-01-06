import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		int totalScore;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		totalScore = sc.nextInt();
		
		i = totalScore / 10;
			
		switch(i) {
		
			case 10:
				System.out.println("A학점입니다");
				break;
			case 9:
				System.out.println("A학점입니다");
				break;
			case 8:
				System.out.println("B학점입니다");
				break;
			case 7:
				System.out.println("C학점입니다");
				break;
			default :
				System.out.println("D학점입니다");
				break;
		}
		

	}

}
