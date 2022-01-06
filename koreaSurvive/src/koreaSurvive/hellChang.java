package koreaSurvive;

public class hellChang extends characterControl {
	
	public void hell() {
		setHp(20);
		setResistance(10);
		setSumInfection();

		System.out.println();
		System.out.println("캐릭터 특징 : 만렙체력");
		System.out.println("체력 : 120");
		System.out.println("캐릭터 코로나 감염 저항력 : 10%");

	}
	
//	public void nightlife(int x1) {
//		if (x1 < 5) {
//			setHp(20); // 체력 20 증가 (적당한 휴식)
//			setResistance(-10);
//		} else if (x1 < 21 && x1 > 10) {
//			setHp(-50); // 체력 50 감소 (근손실)
//			setResistance(-30);
//			setShine(30);
//		} else if (x1 > 20){
//			setHp(-80); // 체력 80 감소 (근손실, 알콜중독)
//			setResistance(-40);
//			setShine(40);
//		}
//	}
	
}
