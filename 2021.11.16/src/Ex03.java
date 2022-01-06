
public class Ex03 {

	public static void main(String[] args) {
		// 문제, 선생님과 나의 나이를 바꿔봅시다
		
		int teacher = 20;
		int my = 22;
		// 나의 나이 값과 선생님의 나이 값을 서로 바꿔라
		
		int i;
		
		i = teacher;
		teacher = my;
		my = i;
		
		
		
		System.out.println("선생님의 나이 : " + teacher);
		System.out.println("나의 나이 : " + my);

	}

}
