import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {

		int h;
		int hm = 5000;
		int total;
		int j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		
		h = sc.nextInt();
		
		j = h - 8;
		
		total = (h <= 8) ? hm * h : hm * 8 + (int)(hm * 1.5) * j;
		
		System.out.println("�� �ӱ��� " + total + "�� �Դϴ�");
		

	}

}
