package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {
		
		MyKart spotage = new MyKart();
		// 첫 시작점은 0! -> spotage.myposition -> 0
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		
		for(int o = 0; o < 100; o++) {
			str[o] = "_";
		}
		
		while(spotage.myposition < 100) {
			System.out.println("1.전진 2.후진 3.부스터");
		//	System.out.println("현재 위치 : " + spotage.myposition );
			for(int o = 0; o < 100; o++) {
				System.out.print(str[o]);
			}
			System.out.println();
			System.out.println();
			System.out.println();
			
			int i = spotage.myposition;
			
			int menu = sc.nextInt();
			if(menu == 1) {
				// 차의 위치가 10만큼 앞으로 가야함
				spotage.go(10);
				i = i + 10;
				for(int k = 0; k < spotage.myposition; k++) {
					str[k] = "*";
				}
			}
			else if(menu == 2) {
				// 차의 위치가 10만큼 뒤로 가야함
				if(spotage.myposition > 0) {
					spotage.back(10);
					
					for(int k = i; k >= spotage.myposition; k--) {
						str[k] = "_";
					}
					i = i - 10;
				}
			}
			else if(menu == 3) {
				// 차의 위치가 30앞으로 가야함
				spotage.booster(30);
				i = i + 30;
				for(int k = 0; k < spotage.myposition; k++) {
					str[k] = "*";
				}
			}
		}
		System.out.println("골인~ 게임 끝");
	}

}
