package koreaSurvive;

public class nurse extends characterControl {
	
	public void nurse() {
		setHp(0);
		setResistance(15);
		setSumInfection();

		System.out.println();
		System.out.println("캐릭터 특징 : 조기백신, 방역복을 입을 시 체력 감소에 저항력이 있음");
		System.out.println("체력 : 100");
		System.out.println("캐릭터 코로나 감염 저항력 : 25%");
	}
	
//	public void nightlife(int x1) {
//		if (x1 <= 5) {
//			setHp(20); // 체력 20 증가 (적당한 휴식)
//			setResistance(-10);
//		} else if (x1 > 5 && x1 < 20) {
//			setHp(-50); // 체력 50 감소 (과로)
//			setResistance(-20);
//		} else if (x1 > 20){
//			setHp(-100); // 체력 80 감소 (근손실, 알콜중독)
//			death = true;
//		}
//	}

}
