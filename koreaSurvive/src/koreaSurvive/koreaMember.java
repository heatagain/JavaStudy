package koreaSurvive;

import java.util.Scanner;

public class koreaMember {

	koreaDb db = new koreaDb();
	Scanner sc = new Scanner(System.in);

	public void memberMenu() {

		while (true) {
			System.out.print("1.�α��� 2.ȸ������ 3.���� >>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
					System.out.println("====�α���====");
					System.out.print("���̵� �Է� : ");
					String id = sc.next();
					System.out.print("��й�ȣ �Է� : ");
					String pw = sc.next();
					db.login(id, pw);
					if (db.loginCnt != 0) {
						break;
					}

			}

			else if (choice == 2) {
				System.out.println("====ȸ������====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();
				System.out.print("�г��� �Է� : ");
				String nick = sc.next();
				db.join(id, pw, nick);
			}

			else if (choice == 3) {
				break;
			}

		}

	}

}
