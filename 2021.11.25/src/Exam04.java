import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		// ����������
		
		String cmp = "�ָ�";
		Random random = new Random();
		//String temp = random.
		System.out.print("��� ���ǰ���??");
		Scanner sc = new Scanner(System.in);
		String user = sc.next(); // ����ڰ� �Է��� ��
		
		// ���ڿ� �񱳴� ���ذ�.equals("�񱳰�") ���
		if(user.equals("��")) {
			System.out.println("�̰��~");
		}
		// ����
		else if(user.equals("����")) {
			System.out.println("����");
		}
		// ����
		else if(user.equals("�ָ�")) {
			System.out.println("����");
		}
		
		
		
		

	}

}
