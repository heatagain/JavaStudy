
public class Exam11 {

	public static void main(String[] args) {

		// �񱳿����� - �� ���� ���� ���ϴ� ������
		// ������� ������ true or false
		// �񱳿������� ������ �׻� ������ �����̴�
		System.out.println(8 > 3);
		System.out.println(3 >= 3);
		System.out.println(7 < 9);
		System.out.println(8 <= 9);
		System.out.println(10 == 10);
		System.out.println(11 != 15);

		// ���ڿ� �� (���ڿ��� ������ ���Ҷ��� equals�� ����Ѵ�)
		String name1 = "�ں���";
		String name2 = "�ں���";
		System.out.println(name1.equals(name2));

		// �� ������ (Not, And, Or)
		// And -> &&
		System.out.println(8 > 7 && 3 < 6);
		// Or -> ||
		System.out.println(7 > 5 || 12 < 3);
		// Not ������
		System.out.println(!(10 < 3));
		

	}

}
