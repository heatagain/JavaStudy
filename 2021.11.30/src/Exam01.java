import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = sc.nextInt();
		
		int result = LargerNumbers(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);
		
		sc.close();

	}
	
	public static int LargerNumbers(int x1, int x2) {
		
//		if(x1 > x2) {
//			return x1;
//		} else if(x1 < x2) {
//			return x2;
//		} else {
//			return 0;
//		}
		
		return x1 != x2 ? (x1 > x2 ? x1 : x2) : 0;
		
	}

}
