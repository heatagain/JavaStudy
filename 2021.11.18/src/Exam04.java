
public class Exam04 {

	public static void main(String[] args) {

		//switch - ���ǹ�
		
		int num = 1;
		// num�� ���� 10�̸� �ȳ��ϼ��並 ���
		// 20�̸� �ȳ��������並 ���
		// 30�̸� ������並 ���
		
		switch(num) {
			case 10:
				System.out.println("�ȳ��ϼ���");
				break;
			
			case 20:
				System.out.println("�ȳ���������");
				break;
				
			case 30:
				System.out.println("�������");
				break;
				
			default :
				System.out.println("��Ȯ�� ���ڰ� �ƴմϴ�.");
				break;
		}
		

	}

}
