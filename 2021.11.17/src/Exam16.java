import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {

		int h;
		int hm = 5000;
		int total;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요 : ");
		
		h = sc.nextInt();
		
		j = h - 8;
		
		total = (h <= 8) ? hm * h : hm * 8 + (int)(hm * 1.5) * j;
		
		System.out.println("총 임금은 " + total + "원 입니다");
		

	}

}
