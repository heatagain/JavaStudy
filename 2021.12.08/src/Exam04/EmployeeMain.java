package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("201101", "박병관", 4000, 800);
		TempEmployee temp = new TempEmployee("202001", "승환", 3000);
		PartTimeEmployee part = new PartTimeEmployee("202105", "수민", 50000, 12);
		Manager manager = new Manager("201002", "동원" , 5000, 1000);
		
//		System.out.println(regular.print());
//		// 월급여 출력
//		System.out.println(regular.getMoneyPay() + "만원");
//		System.out.println(temp.print());
		
		System.out.println(regular.print());
		System.out.println(temp.print());
		System.out.println(part.print());
		System.out.println(manager.print());
				

	}

}
