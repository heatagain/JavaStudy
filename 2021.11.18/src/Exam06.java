import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		int totalScore;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		totalScore = sc.nextInt();
		
		i = totalScore / 10;
			
		switch(i) {
		
			case 10:
				System.out.println("A�����Դϴ�");
				break;
			case 9:
				System.out.println("A�����Դϴ�");
				break;
			case 8:
				System.out.println("B�����Դϴ�");
				break;
			case 7:
				System.out.println("C�����Դϴ�");
				break;
			default :
				System.out.println("D�����Դϴ�");
				break;
		}
		

	}

}
