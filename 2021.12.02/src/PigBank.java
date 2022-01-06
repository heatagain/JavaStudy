
public class PigBank {
	
	int money;
	
	public PigBank(int money) {
		this.money = money;
	}
	
	// 돈을 넣는다
	public void deposit(int inputMoney) {
		this.money += inputMoney;
	}
	
	public void withdraw(int outMoney) {
		this.money -= outMoney;
	}

	// 돈을 출력하는 메소드 showMoney()
	public void showMoney() {
		System.out.println("현재 금액 : " + this.money);
	}
	
}
