
public class PhoneMain {

	public static void main(String[] args) {
		
		// Phone 클래스 사용
		// 클래스명 객체명(변수명) = new Phone();
		Phone iPhone = new Phone(30,"22222");

		System.out.println(iPhone.number);
		iPhone.Camera();
		
		// new Phone(); default 생성자
		Phone galaxy = new Phone(50, "1111111");

		
		Phone lollipop = new Phone(10, "011");


	}

}
