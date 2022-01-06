import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		// 가위바위보
		
		String cmp = "주먹";
		Random random = new Random();
		//String temp = random.
		System.out.print("어떤걸 낼건가요??");
		Scanner sc = new Scanner(System.in);
		String user = sc.next(); // 사용자가 입력한 값
		
		// 문자열 비교는 기준값.equals("비교값") 사용
		if(user.equals("보")) {
			System.out.println("이겼당~");
		}
		// 졌다
		else if(user.equals("가위")) {
			System.out.println("졌다");
		}
		// 비겼다
		else if(user.equals("주먹")) {
			System.out.println("비겼다");
		}
		
		
		
		

	}

}
