import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // ������ ���������� ��������� ��ü

//		ArrayList<Music> musicList = new ArrayList<Music>();
//		musicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
//		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		//int index = 0; // �뷡 ��ġ����
		MusicPlayer player = new MusicPlayer();
		
		while (true) {

			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// ��� -> ��, Rain, 1��40��
				//mp3.play(musicList.get(index).getPath());
				// Conroller �ҷ��ͼ� �����Ű��
				
				show(player.musicList, player.index);
				player.play();

			} else if (menu == 2) {
				player.mp3.stop();
				System.out.println("������ �����մϴ�");
				
			} else if (menu == 3) {
				// ������ -> Dalla Dalla, Itzy, 2��
				// SOLO ���ķ� �������� ������
				// '����� ���� �����ϴ�'�� ��� �����ּ���
//				if (mp3.isPlaying()) {
//					// ���� ������� �뷡�� �ִٸ� true
//					// ���� ������� �뷡�� ���ٸ� false
//					mp3.stop();
//				}
//				if (player.index < player.musicList.size() - 1) {
//					player.index++;
//					show(player.musicList, player.index);
//					mp3.play(player.musicList.get(player.index).getPath());
//				} else {
//					System.out.println("����� ���� �����ϴ�.");
//				}
				int cnt = player.nextPlay();
				if(cnt == 0 ) {
					show(player.musicList, player.index);
				}
				else {
					System.out.println("�������� �����ϴ�.");
				}
				
				
				
			} else if (menu == 4) {
				// ������
				// index�� Ȱ���ؼ� ������ּ���
				// ��, '��' �������� ������
				// �������� �����ϴٸ� ��½�Ű����
//				if (mp3.isPlaying()) {
//					// ���� ������� �뷡�� �ִٸ� true
//					// ���� ������� �뷡�� ���ٸ� false
//					mp3.stop();
//				}
//				if (player.index > 0) {
//					player.index--;
//					show(player.musicList, player.index);
//					mp3.play(player.musicList.get(player.index).getPath());
//				} else {
//					System.out.println("�������� �����ϴ�.");
//				}
				
				int cnt = player.beforePlay();
				if(cnt == 0) {
					show(player.musicList, player.index);
				}else {
					System.out.println("�������� �����ϴ�.");
				}
				

			} else if (menu == 5) {
				System.out.println("���α׷� ����");
				break;

			}

		}

	}

	private static void show(ArrayList<Music> musicList, int index) {
		System.out.print(musicList.get(index).getMusicName() + ", ");
		System.out.print(musicList.get(index).getSinger() + ", ");
		System.out.print(musicList.get(index).getPlayTime() / 60 + "��" + musicList.get(index).getPlayTime() % 60 + "��");
		System.out.println();
	}

}

// MVC ����
// M(model) : �����͵��� ǥ���Ǵ� ����
// V(view) : �������� �� (�����)
// C(controller) : ����� ����ϴ� ����
