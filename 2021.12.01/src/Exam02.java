import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		String input2;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();
		int lo = 0;

		while (true) {
			System.out.println("[1]�뷡�߰� [2]�뷡���� [3]�뷡�˻� [4]����");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("=====List=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + "." + musicList.get(i));
				}
				System.out.println("==============");
				System.out.print("�߰��� �뷡 �Է� >> ");
				input2 = sc.next();
				musicList.add(input2);

			} else if (input == 2) {
				System.out.println("=====List=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + "." + musicList.get(i));
				}
				System.out.println("==============");
				System.out.print("������ �뷡 �Է� >> ");
				input = sc.nextInt();
				musicList.remove(input - 1);

			} else if (input == 3) {

				System.out.print("�˻��� �뷡 ���� �Է� >> ");
				input2 = sc.next();
				boolean choice = false;
				for (int i = 0; i < musicList.size(); i++) {
					if (input2.equals(musicList.get(i))) {
						System.out.println("�˻��� �뷡�� " + (i + 1) + "��°�� �ֽ��ϴ�");
						choice = true;
					}
				}
				
				if(choice == false) {
					System.out.println("�˻��� �뷡�� �����ϴ�!");
				}
				

			} else if (input == 4) {
				System.out.println("���α׷��� ���� �Ǿ����ϴ�!");
				break;
			}
		}

	}

}
