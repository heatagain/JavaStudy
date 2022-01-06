import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PigBank bank = new PigBank(1000);
		bank.showMoney();

		System.out.print("입금액 입력 >> ");
		int inputMoney = sc.nextInt();
		bank.deposit(inputMoney);
		bank.showMoney();

		// 인출할 금액
		System.out.print("출금액 입력 >> ");
		int outMoney = sc.nextInt();
		bank.withdraw(outMoney);
		bank.showMoney();

	}

}
