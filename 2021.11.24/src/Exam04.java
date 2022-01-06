import java.util.Arrays;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int i = 0;
		int menu = 0;
		int index = 0; // 회원의 수
		Scanner sc = new Scanner(System.in);
		String[] idArray = {"","",""};
		int[] pwArray = new int[3];
		
		String idTemp;
		int pwTemp;

		// 단 3명 초과로 회원가입을 한다면
		// 종료

		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("===회원가입===");
				if (index < 3) {
					System.out.print("id 입력 : ");
					idArray[index] = sc.next();
					System.out.print("pw 입력 : ");
					pwArray[index] = sc.nextInt();
					index++;
					System.out.println("가입성공");
				} else {
					System.out.println("가입가능 인원 초과");

				}

			} else if (menu == 2) {
				System.out.println("===로그인===");
				System.out.print("id 입력 : ");
				idTemp = sc.next();
				System.out.print("pw 입력 : ");
				pwTemp = sc.nextInt();

				i = 0;
				while (i < 3) {
					if (idArray[i].equals(idTemp) && pwArray[i] == pwTemp) {
						System.out.println("로그인 성공");
						break;
					}
					else
						i++;
					
					if (i == 3) {
						System.out.println("로그인 실패");
					}
				}
				
//				int cnt = 0;// 로그인 성공을 판별할 변수
//				for(i = 0; i<idArray.length; i++) {
//					
//					if(idArray[i].equals(idTemp) && pwArray[i] == pwTemp) {
//						System.out.println("로그인 성공");
//						cnt++;
//					}
//				}
//				if(cnt == 0) {
//					System.out.println("로그인 실패");
//				}

			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		sc.close();
	}

}
