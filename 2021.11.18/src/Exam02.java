import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		int db;
		int e;
		int os;
		int data;
		int soft;
		int total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DB : ");
		db = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		e = sc.nextInt();
		
		System.out.print("OS : ");
		os = sc.nextInt();
		
		System.out.print("데이터통신 : ");
		data = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		soft = sc.nextInt();
		
		total = db + e + os + data + soft;
		
		if(db < 8) {
			
			System.out.println("불합격입니다!");
			
		}
		
		else if(e < 8) {
			
			System.out.println("불합격입니다!");
			
		}
		
		else if(os < 8) {
			
			System.out.println("불합격입니다!");
			
		}
		
		else if(data < 8) {
	
			System.out.println("불합격입니다!");
	
		}
		
		else if(soft < 8) {
	
			System.out.println("불합격입니다!");
	
		}
		
		else if(total >= 60) {
			
			System.out.println("합격입니다!");
	
		}
		
		else {
			System.out.println("불합격입니다!");
		}
		
		sc.close();

	}

}

// boolean isCheck1 = db >= 8 && ec >= 8 && dc >= 8 && sw >= 8;
// boolean isCheck2 = total >= 60;
// boolean result = isCheck1 && isCheck2;
// if(result) { ~~