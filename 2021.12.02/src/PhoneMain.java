
public class PhoneMain {

	public static void main(String[] args) {
		
		// Phone Ŭ���� ���
		// Ŭ������ ��ü��(������) = new Phone();
		Phone iPhone = new Phone(30,"22222");

		System.out.println(iPhone.number);
		iPhone.Camera();
		
		// new Phone(); default ������
		Phone galaxy = new Phone(50, "1111111");

		
		Phone lollipop = new Phone(10, "011");


	}

}
