package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("201101", "�ں���", 4000, 800);
		TempEmployee temp = new TempEmployee("202001", "��ȯ", 3000);
		PartTimeEmployee part = new PartTimeEmployee("202105", "����", 50000, 12);
		Manager manager = new Manager("201002", "����" , 5000, 1000);
		
//		System.out.println(regular.print());
//		// ���޿� ���
//		System.out.println(regular.getMoneyPay() + "����");
//		System.out.println(temp.print());
		
		System.out.println(regular.print());
		System.out.println(temp.print());
		System.out.println(part.print());
		System.out.println(manager.print());
				

	}

}
