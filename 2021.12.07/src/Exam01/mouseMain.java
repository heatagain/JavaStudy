package Exam01;

public class mouseMain {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		wheelMouse mouse2 = new wheelMouse();
		
		mouse.leftClick();
		mouse.rightClick();
		
		mouse2.leftClick();
		mouse2.rightClick();
		mouse2.scroll();	// Ȯ��
		
		
		// ��ĳ���� -> ���� Ŭ������ ��ü��
		// ���� Ŭ������ ��ü Ÿ������ ����ȯ
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		// �������̵��� ����� ���
		// ��ĳ���� �ϴ��� �ڽĿ� �ִ� ����� ����Ѵ�
		mouse3.leftClick();

		
	}

}
