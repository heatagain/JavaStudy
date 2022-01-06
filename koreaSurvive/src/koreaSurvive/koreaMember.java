package koreaSurvive;

import java.util.Scanner;

public class koreaMember {

	koreaDb db = new koreaDb();
	Scanner sc = new Scanner(System.in);

	public void memberMenu() {

		while (true) {
			System.out.print("1.로그인 2.회원가입 3.종료 >>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
					System.out.println("====로그인====");
					System.out.print("아이디 입력 : ");
					String id = sc.next();
					System.out.print("비밀번호 입력 : ");
					String pw = sc.next();
					db.login(id, pw);
					if (db.loginCnt != 0) {
						break;
					}

			}

			else if (choice == 2) {
				System.out.println("====회원가입====");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nick = sc.next();
				db.join(id, pw, nick);
			}

			else if (choice == 3) {
				break;
			}

		}

	}

}
