import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		float math;
		float eng;
		float sci;
		float total;
		float avg;
		double avg2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� >> ");
		math = sc.nextInt();
		
		System.out.print("���� ���� �Է� >> ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� >> ");
		sci = sc.nextInt();
		
		total = math + eng + sci;
		
		avg = total / 3; //3.0�� ����
		
		//int charge1 = (int)(avg * 100);
		//double result = change1 * 0.01;
		
		
		if(avg % 0.01 >= 0.005) {
		avg2 = (0.01 + avg) - avg % 0.01;
		}
		else
		{
			avg2 = (avg -(avg % 0.01));
		}
		
		// syso("���" + avg + "��");
		if(avg >= 90) {
			System.out.println(avg2 + " A�����Դϴ�.");
		}
		else if(avg >= 80) {
			System.out.println(avg2 + " B�����Դϴ�.");
		}
		else if(avg >= 70) {
			System.out.println(avg2 + " C�����Դϴ�.");
		}
		else {
			System.out.println(avg2 + " F�����Դϴ�.");
		}
	
		sc.close();
	}

}
