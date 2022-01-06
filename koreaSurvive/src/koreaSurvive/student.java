package koreaSurvive;

public class student extends characterControl {

	public void stu() {
		setHp(0);
		setResistance(10);
		setSumInfection();

		System.out.println();
		System.out.println("캐릭터 특징 : 대유행시 1회차 스킵 가능");
		System.out.println("체력 : 100");
		System.out.println("추가된 코로나 감염 저항력 : 10%");

	}

//	public void nightlife(int x1) {
//
//		if (x1 == 1) {
//			grade(7); // 성적 7등급
//			setInfection(10);
//			setShine(70);
//		} else if (x1 > 3) {
//			grade(9); // 성적 9등급
//			setInfection(30);
//			setShine(70);
//		} else if (x1 == 0) {
//			grade(3); // 성적 3등급
//		}
//	}
}
