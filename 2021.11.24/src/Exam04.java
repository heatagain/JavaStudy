import java.util.Arrays;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		int i = 0;
		int menu = 0;
		int index = 0; // ȸ���� ��
		Scanner sc = new Scanner(System.in);
		String[] idArray = {"","",""};
		int[] pwArray = new int[3];
		
		String idTemp;
		int pwTemp;

		// �� 3�� �ʰ��� ȸ�������� �Ѵٸ�
		// ����

		while (true) {
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("===ȸ������===");
				if (index < 3) {
					System.out.print("id �Է� : ");
					idArray[index] = sc.next();
					System.out.print("pw �Է� : ");
					pwArray[index] = sc.nextInt();
					index++;
					System.out.println("���Լ���");
				} else {
					System.out.println("���԰��� �ο� �ʰ�");

				}

			} else if (menu == 2) {
				System.out.println("===�α���===");
				System.out.print("id �Է� : ");
				idTemp = sc.next();
				System.out.print("pw �Է� : ");
				pwTemp = sc.nextInt();

				i = 0;
				while (i < 3) {
					if (idArray[i].equals(idTemp) && pwArray[i] == pwTemp) {
						System.out.println("�α��� ����");
						break;
					}
					else
						i++;
					
					if (i == 3) {
						System.out.println("�α��� ����");
					}
				}
				
//				int cnt = 0;// �α��� ������ �Ǻ��� ����
//				for(i = 0; i<idArray.length; i++) {
//					
//					if(idArray[i].equals(idTemp) && pwArray[i] == pwTemp) {
//						System.out.println("�α��� ����");
//						cnt++;
//					}
//				}
//				if(cnt == 0) {
//					System.out.println("�α��� ����");
//				}

			} else if (menu == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}
		sc.close();
	}

}
