package Exam02;

public class SnackMain {

	public static void main(String[] args) {
		
		// 실질적으로 My 클래스를 통해서
		// 과자를 먹는 기능을 수행
		My m1 = new My();
		꼬깔콘 snack1 = new 꼬깔콘();
		홈런볼 snack2 = new 홈런볼();
		썬칩 snack3 = new 썬칩();
		
		// 꼬깔콘 먹기
//		m1.꼬깔콘Open(snack1);
//		m1.홈런볼Open(snack2);
//		m1.썬칩Open(snack3);
		m1.snackOpen(snack1);
		m1.snackOpen(snack2);
		m1.snackOpen(snack3);
		
	}

}
