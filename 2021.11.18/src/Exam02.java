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
		
		System.out.print("���ڰ��� ���� : ");
		e = sc.nextInt();
		
		System.out.print("OS : ");
		os = sc.nextInt();
		
		System.out.print("��������� : ");
		data = sc.nextInt();
		
		System.out.print("����Ʈ������� : ");
		soft = sc.nextInt();
		
		total = db + e + os + data + soft;
		
		if(db < 8) {
			
			System.out.println("���հ��Դϴ�!");
			
		}
		
		else if(e < 8) {
			
			System.out.println("���հ��Դϴ�!");
			
		}
		
		else if(os < 8) {
			
			System.out.println("���հ��Դϴ�!");
			
		}
		
		else if(data < 8) {
	
			System.out.println("���հ��Դϴ�!");
	
		}
		
		else if(soft < 8) {
	
			System.out.println("���հ��Դϴ�!");
	
		}
		
		else if(total >= 60) {
			
			System.out.println("�հ��Դϴ�!");
	
		}
		
		else {
			System.out.println("���հ��Դϴ�!");
		}
		
		sc.close();

	}

}

// boolean isCheck1 = db >= 8 && ec >= 8 && dc >= 8 && sw >= 8;
// boolean isCheck2 = total >= 60;
// boolean result = isCheck1 && isCheck2;
// if(result) { ~~