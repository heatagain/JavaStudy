
public class Exam06 {

	public static void main(String[] args) {
		// �޼ҵ� ����
		// 1. public ���� ������
		// 2. static Ű����
		// 3. ������ Ÿ��(return) / void (���� Ÿ�� ����)
		// 4. �Լ� ��
		// 5. �Ű����� -> �˰����� ����� ���� x��
		// �޼ҵ带 ����ϴ� ���
		// 1. �޼ҵ��� ���� (class ��, main�޼ҵ� �ۿ��� ����)
		// 2. �޼ҵ� ȣ��(����ϰ��� �ϴ� �Լ��� �̸��� �ۼ��Ѵ�)

		add(3, 5);
		System.out.println(add2(3, 5));
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
	}

	public static void add(int x1, int x2) {

		int result = x1 + x2;
		System.out.println(result);
	}

	public static int add2(int x1, int x2) {

		System.out.println(x1 + x2);
		return x1 + x2;

	}

	public static void sub(int x1, int x2) {

		int result = x1 - x2;
		System.out.println(result);
	}

	public static void mul(int x1, int x2) {

		int result = x1 * x2;
		System.out.println(result);
	}

	public static void div(int x1, int x2) {

		int result = x1 / x2;
		System.out.println(result);
	}
}
