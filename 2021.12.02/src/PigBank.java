
public class PigBank {
	
	int money;
	
	public PigBank(int money) {
		this.money = money;
	}
	
	// ���� �ִ´�
	public void deposit(int inputMoney) {
		this.money += inputMoney;
	}
	
	public void withdraw(int outMoney) {
		this.money -= outMoney;
	}

	// ���� ����ϴ� �޼ҵ� showMoney()
	public void showMoney() {
		System.out.println("���� �ݾ� : " + this.money);
	}
	
}
