import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		int i;
		int input;
		int count = 1;
		String[] array = { "��", "��" };
		Scanner sc = new Scanner(System.in);

		System.out.println("==== ���� ���� Start! ====");
		System.out.print("���ڸ� �Է����ּ���>> ");
		input = sc.nextInt();

		while (count <= input) {
			for (i = 0; i < 2; i++) {
				if(count <= input) {
				System.out.print(array[i]);
				}
				count++;
			}
		}
		
//		for(i = 0; i<input; i++) {
//			if(i%2==0) {
//				System.out.println(array[0]);
//			} else {
//				System.out.println(array[1]);
//			}
//		}
		//2. �ι�° ���
		// ����ڰ� ���ڸ� �Է��ϸ�
		// �Է��� ���ڿ� �°� array(�迭) ����
		// �迭�ȿ��� "��", "��" �̶� ���ڰ� ������� ������ ����
		// ���������� �迭 ���
		
//		System.out.print("���ڸ� �Է� >> ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		
//		String[] array = new String[size];
//		for(int i = 0; i < array.length; i++) {
//			if(i%2==0) {
//				array[i] = "��";
//				
//			} else {
//				array[i] = "��";
//			}
//		}
//		for(int i = 0; i<size; i++) {
//			System.out.print(array[i]);
//		}
//		
		// System.out.println(Arrays.toString(array)); // for�� ���� �迭 ���
		sc.close();
	}

}
