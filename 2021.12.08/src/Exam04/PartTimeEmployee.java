package Exam04;

public class PartTimeEmployee extends Employee {
	// 자식 클래스에서는 무조건 상속받은 추상 메소드가 구현되어야 함
	
//	String empno;
//	String name;
//	int pay;
	int workDay;
	
	// 생성자 오버로딩
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.workDay = workDay;
	}
	
	@Override	
	public int getMoneyPay() {
		
		return pay * workDay;
	}
	
//	@Override
//	public String print() {
//		
//		return empno + " : " + name + " : " + pay;
//	}

}
