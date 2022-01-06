package Exam04;

public class Manager extends Employee {
	
//	String empno; // 사번
//	String name; // 이름
//	int pay; // 연봉
	int bonus; // 보너스

	public Manager(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		return pay + bonus * 2 / 12;
	}

//	@Override
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}

}
