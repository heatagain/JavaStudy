import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
		int hour = totalSecond / 3600;
		int min = totalSecond % 3600;
		int min2 = min / 60;
		int sec = min % 60;
		
		System.out.println(hour + "시" + min2 + "분" + sec+ "초");
		
		
	}

}
