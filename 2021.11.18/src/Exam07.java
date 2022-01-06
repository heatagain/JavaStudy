import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {


		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		i = sc.nextInt();
		
		// int j = i ;
		// i/3
		// case 4,0
		// case 1
		// case 2
		// case 3
		
		switch(i) {
			case 12, 1, 2:
				System.out.println(i + "월은 겨울입니다!");
				break;
			case 3, 4, 5:
				System.out.println(i + "월은 봄입니다!");
				break;
			case 6, 7, 8:
				System.out.println(i + "월은 여름입니다!");
				break;
			case 9, 10, 11:
				System.out.println(i + "월은 가을입니다!");
				break;
		}
		sc.close();
	}

}
