package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

		BookData book1 = new BookData("자바", 10000, "병관");
		BookData book2 = new BookData("DataBase", 20000, "동원");
		BookData book3 = new BookData("Web", 30000, "승환");
		Scanner sc = new Scanner(System.in);
		BookData[] bookList = new BookData[3];
//		bookList[0] = book1;
//		bookList[1] = book2;
//		bookList[2] = book3;
		ArrayList<BookData> array = new ArrayList<BookData>();
		array.add(book1);
		array.get(0).getTitle();
		// 추가 -> add
		// 삭제 -> remove
		// 가져오기 -> get
		// 크기 -> size

		for (int i = 0; i < bookList.length; i++) {
			System.out.print("책 제목을 입력해주세요 >> ");
			String title = sc.next();
			System.out.println("저자를 입력해주세요 >> ");
			String writer = sc.next();
			System.out.print("가격을 입력해주세요 >> ");
			int price = sc.nextInt();


			BookData book = new BookData(title, price, writer);
			bookList[i] = book;

		}
		System.out.println("================================");
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i].getPrice() <= money) {
				System.out.println("[" + bookList[i].getTitle() + ", " + bookList[i].getWriter() + ", "
						+ bookList[i].getPrice() + "원]");
			}
		}

		// bookList 사용해서 책 이름을 전부 출력해주세요!
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println(bookList[i].getTitle());
//		}
		// private 같은 클래스 내에서만 접근가능
		// protected 같은 패키지, 상속 관계 접근가능
		// default 같은 패키지 내에서만 접근가능

		// private으로 감춰진 정보를 접근하는 방법
		// System.out.println("책 제목 : " + book1.getTitle());

	}

}
