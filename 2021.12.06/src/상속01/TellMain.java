package 상속01;

public class TellMain {

	public static void main(String[] args) {
		
		Tell tell = new Tell();
		tell.Call();
		
		// 부모에 있는 기능을 전부 상속 받았기 때문에 
		// 작성해주지 않아도 기능이 사용가능하다
		Folder folder = new Folder();
		folder.Call();
		folder.Camera();
		folder.ButtonClick();
		

	}

}
