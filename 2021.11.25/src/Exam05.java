// �������
public class Exam05 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
//		System.out.print("1���� 45 ���� �� �� : ");

//		for (num = 1; num <= 45; num++) {
//			sum += num;
//		}

//		while (true) {
//			sum += num;
//			if(sum > 1000) {
//				break;
//			}
//			num++;
//		}

//		System.out.println(sum);
		// %d : �����ڸ�
		
		
//		int num1 = 0;
//		int sum1 = 0;
//		
//		while (sum1 < 1000) {
//			num1++;
//			sum1 += num1;
//		}
		
		// System.out.printf("1���� %d���� ���� : %d\n", num2, sum2);
		
		int num2 = 0;
		int sum2 = 0;
		// do-while��
		do {	//�ݺ��� ����
			sum2 = sum2 + num2;
			num2++;
		}while(sum2<1000);	//����(true/false)
		System.out.printf("1���� %d���� ���� : %d\n", num2, sum2);
		
		
		
	}

}
