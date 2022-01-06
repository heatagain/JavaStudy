package koreaSurvive;

public class characterControl {

	private static int hp = 100;
	private static int resistance = 10;
	private static int infection = 100;
	private static int sumInfection = 0;
	private static int mask = 90;
	public static boolean life = true;
	
	public void setDefaultInfection() {
		infection = 100;
	}
	
	public void setDefaultResistance() {
		resistance = 10;
	}
	public void setDefaultNurseResistance() {
		resistance = 15;
	}
	
	public void setSeoulResistance() {
		resistance += 0;
	}
	public void setProvinceResistance() {
		resistance += 15;
	}
	public void setGangWonResistance() {
		resistance += 30;
	}
	
	

	// 체력 불러오기
	public int getDefaultHp() {
		return hp;
	}


	// 저항력 불러오기
	public int getDefaultResistance() {
		return resistance;
	}


	// 코로나 감염력 불러오기
	public int getDefaultInfection() {
		return infection;
	}

	// 체력 조절
	public void setHp(int x1) {
		hp += x1;
	}


	// 저항력 조절
	public void setResistance(int x1) {
		resistance += x1;
		if(resistance > 100) {
			resistance -= resistance % 100 +1;	
		} else if(resistance < 0) {
			resistance += resistance * -1;
		}
	}

	// 코로나 감염력 조절
	public void setInfection(int x1) {
		infection += x1;
//		if(infection > 100) {
//			infection -= infection % 100;	
//		} else if(infection < 0) {
//			infection += infection;
//		}
	}



	// 합산 감염확률
	public int setSumInfection() {
		return infection - resistance;
	}

	public int getSumInfection() {
		sumInfection = infection - resistance;
		if(sumInfection > 100) {
			sumInfection -= sumInfection % 100;
		}
		return sumInfection;
	}

	public int getMask() {
		return mask;
	}
}


