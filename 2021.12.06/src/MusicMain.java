import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // 음악을 실질적으로 재생시켜줄 객체

//		ArrayList<Music> musicList = new ArrayList<Music>();
//		musicList.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3"));
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
//		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		//int index = 0; // 노래 위치정보
		MusicPlayer player = new MusicPlayer();
		
		while (true) {

			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 재생 -> 깡, Rain, 1분40초
				//mp3.play(musicList.get(index).getPath());
				// Conroller 불러와서 실행시키기
				
				show(player.musicList, player.index);
				player.play();

			} else if (menu == 2) {
				player.mp3.stop();
				System.out.println("음악을 정지합니다");
				
			} else if (menu == 3) {
				// 다음곡 -> Dalla Dalla, Itzy, 2분
				// SOLO 이후로 다음곡을 누르면
				// '재생할 곡이 없습니다'를 출력 시켜주세요
//				if (mp3.isPlaying()) {
//					// 현재 재생중인 노래가 있다면 true
//					// 현재 재생중인 노래가 없다면 false
//					mp3.stop();
//				}
//				if (player.index < player.musicList.size() - 1) {
//					player.index++;
//					show(player.musicList, player.index);
//					mp3.play(player.musicList.get(player.index).getPath());
//				} else {
//					System.out.println("재생할 곡이 없습니다.");
//				}
				int cnt = player.nextPlay();
				if(cnt == 0 ) {
					show(player.musicList, player.index);
				}
				else {
					System.out.println("다음곡이 없습니다.");
				}
				
				
				
			} else if (menu == 4) {
				// 이전곡
				// index를 활용해서 만들어주세요
				// 단, '깡' 이전곡을 누르면
				// 이전곡이 없습니다를 출력시키세요
//				if (mp3.isPlaying()) {
//					// 현재 재생중인 노래가 있다면 true
//					// 현재 재생중인 노래가 없다면 false
//					mp3.stop();
//				}
//				if (player.index > 0) {
//					player.index--;
//					show(player.musicList, player.index);
//					mp3.play(player.musicList.get(player.index).getPath());
//				} else {
//					System.out.println("이전곡이 없습니다.");
//				}
				
				int cnt = player.beforePlay();
				if(cnt == 0) {
					show(player.musicList, player.index);
				}else {
					System.out.println("이전곡이 없습니다.");
				}
				

			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;

			}

		}

	}

	private static void show(ArrayList<Music> musicList, int index) {
		System.out.print(musicList.get(index).getMusicName() + ", ");
		System.out.print(musicList.get(index).getSinger() + ", ");
		System.out.print(musicList.get(index).getPlayTime() / 60 + "분" + musicList.get(index).getPlayTime() % 60 + "초");
		System.out.println();
	}

}

// MVC 패턴
// M(model) : 데이터들이 표현되는 역할
// V(view) : 보여지는 것 (사용자)
// C(controller) : 기능을 담당하는 역할
