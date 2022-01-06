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
		
		System.out.print("수학 점수 입력 >> ");
		math = sc.nextInt();
		
		System.out.print("영어 점수 입력 >> ");
		eng = sc.nextInt();

		System.out.print("과학 점수 입력 >> ");
		sci = sc.nextInt();
		
		total = math + eng + sci;
		
		avg = total / 3; //3.0도 가능
		
		//int charge1 = (int)(avg * 100);
		//double result = change1 * 0.01;
		
		
		if(avg % 0.01 >= 0.005) {
		avg2 = (0.01 + avg) - avg % 0.01;
		}
		else
		{
			avg2 = (avg -(avg % 0.01));
		}
		
		// syso("평균" + avg + "점");
		if(avg >= 90) {
			System.out.println(avg2 + " A학점입니다.");
		}
		else if(avg >= 80) {
			System.out.println(avg2 + " B학점입니다.");
		}
		else if(avg >= 70) {
			System.out.println(avg2 + " C학점입니다.");
		}
		else {
			System.out.println(avg2 + " F학점입니다.");
		}
	
		sc.close();
	}

}
