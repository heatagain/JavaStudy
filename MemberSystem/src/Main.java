import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.�α��� 2. ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.����

		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ������ �ý���====");
		MemberDAO dao = new MemberDAO();
		while (true) {

			System.out.print("1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.���� >>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====�α���====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();
				String nick = dao.login(id, pw);
				if (nick != null) {
					System.out.println(nick + "�� ȯ���մϴ�!");

					if (id.equals("admin")) {
						System.out.println("1. ȸ���������� 2.ȸ������");
						choice = sc.nextInt();

						if (choice == 1) {
							System.out.println("==== ������ ȸ���������� ====");
							System.out.print("���̵� �Է� : ");
							String change_id = sc.next();
							System.out.print("������ �г��� �Է� : ");
							String change_nick = sc.next();

							int cnt = dao.adminUpdate(change_id, change_nick);

							if (cnt > 0) {
								System.out.println("ȸ������ ���� �Ϸ�");
							} else {
								System.out.println("ȸ������ ���� ����");
							}
						} else if (choice == 2) {
							System.out.println("==== ������ ȸ������ ====");

							ArrayList<MemberDTO> arraylist = dao.selectAll();
							int cnt = 1;
							for (int i = 0; i < arraylist.size(); i++) {

								MemberDTO m = arraylist.get(i);
								if (!m.getId().equals("admin"))
									System.out.println(cnt + "." + m.getId());
								cnt++;
							}

							System.out.print("������ ���̵� �Է� : ");
							String removeId = sc.next();

							int result = dao.deleteId(removeId);

							if (result > 0) {
								System.out.println("���̵� ���� �Ϸ�");
							} else {
								System.out.println("���̵� ���� ����");
							}

						}

					}
				} else {
					System.out.println("�α��� ����...");
				}

			} else if (choice == 2) {

				System.out.println("====ȸ������====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();
				System.out.print("�г��� �Է� : ");
				String nick = sc.next();
				int cnt = dao.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}

			} else if (choice == 3) {
				// ȸ�� ��� ����
				System.out.println("==== ȸ����� ����====");
				ArrayList<MemberDTO> arraylist = dao.selectAll();
				for (int i = 0; i < arraylist.size(); i++) {

					MemberDTO m = arraylist.get(i);
					System.out.print(arraylist.get(i).getId() + "-");
					System.out.print(arraylist.get(i).getPw() + "-");
					System.out.println(arraylist.get(i).getNick());
				}

			} else if (choice == 4) {
				// ȸ�� ���� ����
				// 1. ����̹� �ε�
//				System.out.print("���̵� �Է� : ");
//				String id = sc.next();
//				System.out.print("��й�ȣ �Է� : ");
//				String pw = sc.next();
				System.out.print("�к� : ");
				String nick = sc.next();
				int cnt = dao.update(nick);

				if (cnt > 0) {
					System.out.println("ȸ������ ���� �Ϸ�");
				} else {
					System.out.println("ȸ������ ���� ����");
				}

			} else if (choice == 5) {
				// ȸ��Ż��
				System.out.println("====ȸ��Ż��====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();

				int cnt = dao.delete(id, pw);

				if (cnt > 0) {
					System.out.println("ȸ������ �Ϸ�");
				} else {
					System.out.println("ȸ������ ����");
				}

			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");
			}

		}

	}

}
