package koreaSurvive;

public class nurse extends characterControl {
	
	public void nurse() {
		setHp(0);
		setResistance(15);
		setSumInfection();

		System.out.println();
		System.out.println("ĳ���� Ư¡ : ������, �濪���� ���� �� ü�� ���ҿ� ���׷��� ����");
		System.out.println("ü�� : 100");
		System.out.println("ĳ���� �ڷγ� ���� ���׷� : 25%");
	}
	
//	public void nightlife(int x1) {
//		if (x1 <= 5) {
//			setHp(20); // ü�� 20 ���� (������ �޽�)
//			setResistance(-10);
//		} else if (x1 > 5 && x1 < 20) {
//			setHp(-50); // ü�� 50 ���� (����)
//			setResistance(-20);
//		} else if (x1 > 20){
//			setHp(-100); // ü�� 80 ���� (�ټս�, �����ߵ�)
//			death = true;
//		}
//	}

}
