package koreaSurvive;

public class level {

	private int easy = 40;
	private int normal = 15;
	private int hard = -10;

	private int easyMode1 = 2;
	private int easyMode2 = 7;
	private int easyMode3 = 10;
	private int easyCono = 10;
	private int nomarlMode1 = 15;
	private int nomarlMode2 = 30;
	private int nomarlMode3 = 45;
	private int nomarlCono = 40;
	private int hardMode1 = 25;
	private int hardMode2 = 50;
	private int hardMode3 = 75;
	private int hardCono = 70;

	private int mode1 = 0;
	private int mode2 = 0;
	private int mode3 = 0;
	private int cono = 0;

	private int easyHpDown1 = -5;
	private int easyHpDown2 = -10;
	private int easyHpDown3 = -30;

	private int nomarlHpDown1 = -7;
	private int nomarlHpDown2 = -20;
	private int nomarlHpDown3 = -40;

	private int hardHpDown1 = -10;
	private int hardHpDown2 = -30;
	private int hardHpDown3 = -45;

//	private int omiHpDown1 = -40;
//	private int omiHpDown2 = -45;
//	private int omiHpDown3 = -50;

	private static int hpDown1 = 0;
	private static int hpDown2 = 0;
	private static int hpDown3 = 0;

	private int easyHpUp1 = 10;
	private int easyHpUp2 = 20;
	private int easyHpUp3 = 30;

	private int nomarlHpUp1 = 8;
	private int nomarlHpUp2 = 16;
	private int nomarlHpUp3 = 24;

	private int hardHpUp1 = 5;
	private int hardHpUp2 = 15;
	private int hardHpUp3 = 20;

//	private int omiHpUp1 = 

	private static int hpUp1 = 0;
	private static int hpUp2 = 0;
	private static int hpUp3 = 0;
	
	
	private int easyResistanceUp1 = 20;
	private int easyResistanceUp2 = 25;
	private int easyResistanceUp3 = 30;
	private int easyResistanceDown1 = -5;
	private int easyResistanceDown2 = -10;
	private int easyResistanceDown3 = -15;
	
	private int nomarlResistanceUp1 = 10;
	private int nomarlResistanceUp2 = 15;
	private int nomarlResistanceUp3 = 20;
	private int nomarlResistanceDown1 = -10;
	private int nomarlResistanceDown2 = -15;
	private int nomarlResistanceDown3 = -20;
	
	private int HardResistanceUp1 = 5;
	private int HardResistanceUp2 = 10;
	private int HardResistanceUp3 = 15;
	private int HardResistanceDown1 = -15;
	private int HardResistanceDown2 = -20;
	private int HardResistanceDown3 = -25;
	
	private static int resistanceUp1 = 0;
	private static int resistanceUp2 = 0;
	private static int resistanceUp3 = 0;
	
	private int resistanceDown1 = 0;
	private int resistanceDown2 = 0;
	private int resistanceDown3 = 0;
	

	// 초기 저항력 관련 수치
	public int getEasy() {
		return easy;
	}

	public int getNormal() {
		return normal;
	}

	public int getHard() {
		return hard;
	}

	public void levelSelect(int x1) {

		if (x1 == 1) {
			getEasyMode1();
			getEasyMode2();
			getEasyMode3();
			getEasyCono();

			getEasyHpDown1();
			getEasyHpDown2();
			getEasyHpDown3();
			getEasyHpUp1();
			getEasyHpUp2();
			getEasyHpUp3();
			
			getEasyResistanceDown1();
			getEasyResistanceDown2();
			getEasyResistanceDown3();
			getEasyResistanceUp1();
			getEasyResistanceUp2();
			getEasyResistanceUp3();
		} else if (x1 == 2) {
			getNomarlMode1();
			getNomarlMode2();
			getNomarlMode3();
			getNomarlCono();

			getNomarlHpDown1();
			getNomarlHpDown2();
			getNomarlHpDown3();
			getNormalHpUp1();
			getNormalHpUp2();
			getNormalHpUp3();
			
			getNomarlResistanceDown1();
			getNomarlResistanceDown2();
			getNomarlResistanceDown3();
			getNomarlResistanceUp1();
			getNomarlResistanceUp2();
			getNomarlResistanceUp3();

		} else if (x1 == 3) {
			getHardMode1();
			getHardMode2();
			getHardMode3();
			getHardCono();

			getHardHpDown1();
			getHardHpDown2();
			getHardHpDown3();
			getHardHpUp1();
			getHardHpUp2();
			getHardHpUp3();
			
			getHardResistanceDown1();
			getHardResistanceDown2();
			getHardResistanceDown3();
			getHardResistanceUp1();
			getHardResistanceUp2();
			getHardResistanceUp3();
		}
	}

	public int getMode1() {
		return mode1;
	}

	public int getMode2() {
		return mode2;
	}

	public int getMode3() {
		return mode3;
	}

	public int getcono() {
		return cono;
	}

	public int getHpDown1() {
		return hpDown1;
	}

	public int getHpDown2() {
		return hpDown2;
	}

	public int getHpDown3() {
		return hpDown3;
	}

	public int getHpUp1() {
		return hpUp1;
	}

	public int getHpUp2() {
		return hpUp2;
	}

	public int getHpUp3() {
		return hpUp3;
	}
	
	public int getResistanceDown1() {
		return resistanceDown1;
	}
	public int getResistanceDown2() {
		return resistanceDown2;
	}
	public int getResistanceDown3() {
		return resistanceDown3;
	}
	
	public int getResistanceUp1() {
		return resistanceUp1;
	}
	public int getResistanceUp2() {
		return resistanceUp2;
	}
	public int getResistanceUp3() {
		return resistanceUp3;
	}
	

	public void getEasyHpDown1() {
		hpDown1 = easyHpDown1;
	}

	public void getEasyHpDown2() {
		hpDown2 = easyHpDown2;
	}

	public void getEasyHpDown3() {
		hpDown3 = easyHpDown3;
	}

	public void getNomarlHpDown1() {
		hpDown1 = nomarlHpDown1;
	}

	public void getNomarlHpDown2() {
		hpDown2 = nomarlHpDown2;
	}

	public void getNomarlHpDown3() {
		hpDown3 = nomarlHpDown3;
	}

	public void getHardHpDown1() {
		hpDown1 = hardHpDown1;
	}

	public void getHardHpDown2() {
		hpDown2 = hardHpDown2;
	}

	public void getHardHpDown3() {
		hpDown3 = hardHpDown3;
	}

	public void getEasyHpUp1() {
		hpUp1 = easyHpUp1;
	}

	public void getEasyHpUp2() {
		hpUp2 = easyHpUp2;
	}

	public void getEasyHpUp3() {
		hpUp3 = easyHpUp3;
	}

	public void getNormalHpUp1() {
		hpUp1 = nomarlHpUp1;
	}

	public void getNormalHpUp2() {
		hpUp2 = nomarlHpUp2;
	}

	public void getNormalHpUp3() {
		hpUp3 = nomarlHpUp3;
	}

	// 하드모드 체력 상승량
	public void getHardHpUp1() {
		hpUp1 = hardHpUp1;
	}

	public void getHardHpUp2() {
		hpUp2 = hardHpUp2;
	}

	public void getHardHpUp3() {
		hpUp3 = hardHpUp3;
	}
	
	// 이지모드 저항력 하락
	public void getEasyResistanceDown1() {
		resistanceDown1 = easyResistanceDown1;
	}
	
	public void getEasyResistanceDown2() {
		resistanceDown2 = easyResistanceDown2;
	}
	
	public void getEasyResistanceDown3() {
		resistanceDown3 = easyResistanceDown3;
	}
	
	// 노말모드 저항력 하락
	
	public void getNomarlResistanceDown1() {
		resistanceDown1 = nomarlResistanceDown1;
	}
	
	public void getNomarlResistanceDown2() {
		resistanceDown2 = nomarlResistanceDown2;
	}
	
	public void getNomarlResistanceDown3() {
		resistanceDown3 = nomarlResistanceDown3;
	}
	
	// 하드모드 저항력 하락
	public void getHardResistanceDown1() {
		resistanceDown1 = HardResistanceDown1;
	}
	
	public void getHardResistanceDown2() {
		resistanceDown2 = HardResistanceDown2;
	}
	
	public void getHardResistanceDown3() {
		resistanceDown3 = HardResistanceDown3;
	}
	
	
	// 이지모드 저항력 업
	public void getEasyResistanceUp1() {
		resistanceUp1 = easyResistanceUp1;
	}
	public void getEasyResistanceUp2() {
		resistanceUp2 = easyResistanceUp2;
	}
	public void getEasyResistanceUp3() {
		resistanceUp3 = easyResistanceUp3;
	}
	
	// 노말모드 저항력 업
	
	public void getNomarlResistanceUp1() {
		resistanceUp1 = nomarlResistanceUp1;
	}
	public void getNomarlResistanceUp2() {
		resistanceUp2 = nomarlResistanceUp2;
	}
	public void getNomarlResistanceUp3() {
		resistanceUp3 = nomarlResistanceUp3;
	}

	// 하드모드 저항력 업
	
	public void getHardResistanceUp1() {
		resistanceUp1 = HardResistanceUp1;
	}
	public void getHardResistanceUp2() {
		resistanceUp2 = HardResistanceUp2;
	}
	public void getHardResistanceUp3() {
		resistanceUp3 = HardResistanceUp3;
	}
	
	

//	public void getOmiHpUp1() {
//		hpUp1 -= 2;
//	}
//	public void getOmiHpUp2() {
//		
//	}
//	public void getOmiHpUp3() {
//		
//	}
	// 오미크론 체력 감소폭 증가
	public void getOmiHpDown1() {
		hpDown1 -= 20;
	}

	public void getOmiHpDown2() {
		hpDown2 -= 20;
	}

	public void getOmiHpDown3() {
		hpDown3 -= 20;
	}

	// 대유행 체력 감소폭 증가
	public void getBigHpDown1() {
		hpDown1 -= 10;
	}

	public void getBigHpDown2() {
		hpDown2 -= 10;
	}

	public void getBigHpDown3() {
		hpDown3 -= 10;
	}

	// 난이도에 따른 가차 확률
	public void getEasyMode1() {
		mode1 = easyMode1;
	}

	public void getEasyMode2() {
		mode2 = easyMode2;
	}

	public void getEasyMode3() {
		mode3 = easyMode3;
	}

	public void getEasyCono() {
		cono = easyCono;
	}

	// 노말모드 선택시 값 삽입
	public void getNomarlMode1() {
		mode1 = nomarlMode1;
	}

	public void getNomarlMode2() {
		mode2 = nomarlMode2;
	}

	public void getNomarlMode3() {
		mode3 = nomarlMode3;
	}

	public void getNomarlCono() {
		cono = nomarlCono;
	}

	public void getHardMode1() {
		mode1 = hardMode1;
	}

	public void getHardMode2() {
		mode2 = hardMode2;
	}

	public void getHardMode3() {
		mode3 = hardMode3;
	}

	public void getHardCono() {
		cono = hardCono;
	}

}
