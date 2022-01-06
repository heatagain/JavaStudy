package Exam02;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// ��ȭ��ȣ��(addressList)�� ���� �߰���Ű�� �ʹ�
				// �̸�, ����, ��ȭ��ȣ�� �Է¹޾Ƽ� -> ��ü�� ����
				// addressList �߰� ��Ű���

				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String number = sc.next();

				Address adr = new Address(name, age, number);
				addressList.add(adr);

			} else if (menu == 2) {

				if (addressList.size() != 0) {
					for (int i = 0; i < addressList.size(); i++) {
						System.out.print((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "��) : " + addressList.get(i).getPhoneNumber());
						System.out.println();
					}
				} else {
					System.out.println("��ϵ� ����ó�� �����ϴ�.");
					System.out.println();
				}

			} else if (menu == 3) {
				if (addressList.size() != 0) {
					for (int i = 0; i < addressList.size(); i++) {
						System.out.print((i + 1) + ". " + addressList.get(i).getName() + "("
								+ addressList.get(i).getAge() + "��) : " + addressList.get(i).getPhoneNumber());
						System.out.println();

					}
					System.out.print("������ ��ȣ �Է� : ");
					int remove = sc.nextInt();
					addressList.remove(remove - 1);
				} else {
					System.out.println("������ ����ó�� �����ϴ�.");
					System.out.println();
				}

			} else if (menu == 4) {
				if (addressList.size() != 0) {
					System.out.print("�˻��� �̸� �Է� : ");
					String inputName = sc.next();
					int cnt = 0;
					for (int i = 0; i < addressList.size(); i++) {
						if (addressList.get(i).getName().equals(inputName)) {
							System.out.print((i + 1) + ". " + addressList.get(i).getName());
							System.out.print("(" + addressList.get(i).getAge() + "��)");
							System.out.print(" : " + addressList.get(i).getPhoneNumber());
							System.out.println();
							cnt++;
						}
					}
					if (cnt == 0) {
						System.out.println("�˻��� �̸��� �����ϴ�.");
					}
				}

			} else if (menu == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
