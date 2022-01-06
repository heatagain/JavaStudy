package Exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 전화번호부(addressList)에 값을 추가시키고 싶다
				// 이름, 나이, 전화번호를 입력받아서 -> 객체로 만들어서
				// addressList 추가 시키면됨

				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String number = sc.next();

				Address adr = new Address(name, age, number);
				addressList.add(adr);

			} else if (menu == 2) {

				if (addressList.size() != 0) {
					for (int i = 0; i < addressList.size(); i++) {
						System.out.print((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "세) : " + addressList.get(i).getPhoneNumber());
						System.out.println();
					}
				} else {
					System.out.println("등록된 연락처가 없습니다.");
					System.out.println();
				}

			} else if (menu == 3) {
				if (addressList.size() != 0) {
					for (int i = 0; i < addressList.size(); i++) {
						System.out.print((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "세) : " + addressList.get(i).getPhoneNumber());
						System.out.println();

					}
					System.out.print("삭제할 번호 입력 : ");
					int remove = sc.nextInt();
					addressList.remove(remove - 1);
				} else {
					System.out.println("삭제할 연락처가 없습니다.");
					System.out.println();
				}

			} else if (menu == 4) {
				if (addressList.size() != 0) {
					System.out.print("검색할 이름 입력 : ");
					String inputName = sc.next();
					int cnt = 0;
					for (int i = 0; i < addressList.size(); i++) {
						if (addressList.get(i).getName().equals(inputName)) {
							System.out.print((i + 1) + ". " + addressList.get(i).getName());
							System.out.print("(" + addressList.get(i).getAge() + "세)");
							System.out.print(" : " + addressList.get(i).getPhoneNumber());
							System.out.println();
							cnt++;
						}
					}
					if (cnt == 0) {
						System.out.println("검색한 이름이 없습니다.");
					}
				}

			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
