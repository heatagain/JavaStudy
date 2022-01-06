import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		String input2;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musicList = new ArrayList<String>();
		int lo = 0;

		while (true) {
			System.out.println("[1]노래추가 [2]노래삭제 [3]노래검색 [4]종료");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("=====List=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + "." + musicList.get(i));
				}
				System.out.println("==============");
				System.out.print("추가할 노래 입력 >> ");
				input2 = sc.next();
				musicList.add(input2);

			} else if (input == 2) {
				System.out.println("=====List=====");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + "." + musicList.get(i));
				}
				System.out.println("==============");
				System.out.print("삭제할 노래 입력 >> ");
				input = sc.nextInt();
				musicList.remove(input - 1);

			} else if (input == 3) {

				System.out.print("검색할 노래 제목 입력 >> ");
				input2 = sc.next();
				boolean choice = false;
				for (int i = 0; i < musicList.size(); i++) {
					if (input2.equals(musicList.get(i))) {
						System.out.println("검색한 노래는 " + (i + 1) + "번째에 있습니다");
						choice = true;
					}
				}
				
				if(choice == false) {
					System.out.println("검색한 노래가 없습니다!");
				}
				

			} else if (input == 4) {
				System.out.println("프로그램이 종료 되었습니다!");
				break;
			}
		}

	}

}
