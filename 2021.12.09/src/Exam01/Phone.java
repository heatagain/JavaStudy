package Exam01;

public interface Phone {
	// �������̽��� ������ ������ ���� �� �� �ִ� -> ���� �Ұ���
	// final�� ���� �����ϴ�
	
	// ��ư
	int button = 12;
	// ����Ŀ
	int speak = 4;
	// ����ũ
	final int mic = 2;
	// �������
	public abstract void Camera();
	// ��ȭ���
	public abstract void Call();
	// �������̽����� �Ϲ� �޼ҵ�� ���� �� ����
	// ������ �߻� �޼ҵ�� �ν� �ϱ� ������
	// public abstract ���� �����ϴ�
	void Message();	// defalut abstract
	
}
