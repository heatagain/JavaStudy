
public class d {

	public static void main(String[] args) {

		int i;
		int j;
		int k;

		for (i = 1; i <= 5; i++) { // 줄바꿈 for문

			for (j = 5; j > i; j--) { // 공백출력 for문
				System.out.print(" ");
			}
			for (k = 1; k <= j; k++) {	// * 출력 for문
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
