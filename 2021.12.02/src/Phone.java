
public class Phone {

	// ��ư ����
	int btnNum = 12;
	// ȭ��ũ��
	int displaySize;
	// ��ȭ��ȣ
	String number;
	// ���ڸ� �����ϴ�

	// ������
	// Ŭ������ ���� ũ�⸦ ������ �� �ʵ尪(Ŭ������ ������ �ִ� ����)�� ���� ������ �� �ִ� �޼ҵ�
	// Ư¡ : ���ϰ� ��ü�� ����, �޼ҵ� �̸��� Ŭ���� �̸��� ����
	public Phone(int displaySize, String number) {
		this.displaySize = displaySize;
		this.number = number;
	}

	public void msgSend() {
		System.out.println("���ڸ� �����ϴ�");
	}

	// ��ȭ�� �ɴ�
	public void Call() {
		System.out.println("��ȭ�� �ɴ�");
	}

	// ���ͳ� �����ϴ�
	public void Wifi() {
		System.out.println("���ͳ� ����");
	}

	// ������ ���
	public void Camera() {
		System.out.println("������ ���");
	}

}
