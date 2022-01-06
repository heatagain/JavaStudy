// 보충수업
public class Exam05 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
//		System.out.print("1부터 45 까지 총 합 : ");

//		for (num = 1; num <= 45; num++) {
//			sum += num;
//		}

//		while (true) {
//			sum += num;
//			if(sum > 1000) {
//				break;
//			}
//			num++;
//		}

//		System.out.println(sum);
		// %d : 정수자리
		
		
//		int num1 = 0;
//		int sum1 = 0;
//		
//		while (sum1 < 1000) {
//			num1++;
//			sum1 += num1;
//		}
		
		// System.out.printf("1부터 %d까지 총합 : %d\n", num2, sum2);
		
		int num2 = 0;
		int sum2 = 0;
		// do-while문
		do {	//반복할 로직
			sum2 = sum2 + num2;
			num2++;
		}while(sum2<1000);	//조건(true/false)
		System.out.printf("1부터 %d까지 총합 : %d\n", num2, sum2);
		
		
		
	}

}
