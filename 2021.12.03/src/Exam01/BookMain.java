package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		BookData book1 = new BookData("�ڹ�", 10000, "����");
		BookData book2 = new BookData("DataBase", 20000, "����");
		BookData book3 = new BookData("Web", 30000, "��ȯ");
		Scanner sc = new Scanner(System.in);
		BookData[] bookList = new BookData[3];
//		bookList[0] = book1;
//		bookList[1] = book2;
//		bookList[2] = book3;
		ArrayList<BookData> array = new ArrayList<BookData>();
		array.add(book1);
		array.get(0).getTitle();
		// �߰� -> add
		// ���� -> remove
		// �������� -> get
		// ũ�� -> size

		for (int i = 0; i < bookList.length; i++) {
			System.out.print("å ������ �Է����ּ��� >> ");
			String title = sc.next();
			System.out.println("���ڸ� �Է����ּ��� >> ");
			String writer = sc.next();
			System.out.print("������ �Է����ּ��� >> ");
			int price = sc.nextInt();


			BookData book = new BookData(title, price, writer);
			bookList[i] = book;

		}
		System.out.println("================================");
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();

		System.out.println("���� ������ å ���");
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i].getPrice() <= money) {
				System.out.println("[" + bookList[i].getTitle() + ", " + bookList[i].getWriter() + ", "
						+ bookList[i].getPrice() + "��]");
			}
		}

		// bookList ����ؼ� å �̸��� ���� ������ּ���!
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println(bookList[i].getTitle());
//		}
		// private ���� Ŭ���� �������� ���ٰ���
		// protected ���� ��Ű��, ��� ���� ���ٰ���
		// default ���� ��Ű�� �������� ���ٰ���

		// private���� ������ ������ �����ϴ� ���
		// System.out.println("å ���� : " + book1.getTitle());

	}

}
