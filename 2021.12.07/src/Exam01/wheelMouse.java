package Exam01;

public class wheelMouse extends Mouse{

	public void scroll() {
		System.out.println("��ũ���� �ϴ�");
		
	}
	
	// �������̵� -> ��Ӱ��迡�� �ڽ�Ŭ������
	// �θ�Ŭ������ ����� ������ �Ҷ� ����Ѵ�
	@Override
	public void leftClick() {
		System.out.println("���� Ŭ��");
		System.out.println("�巡��");
	}
	
}
