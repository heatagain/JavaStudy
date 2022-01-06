import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	// Controller : �������� ����� ����� Ŭ����

	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;
	
	public MusicPlayer() {
		musicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
	}
	
	// ������ ���ֱ�
	public void play() {
		mp3.play(musicList.get(index).getPath());
		
	}
	// �������� ������ ���
	public int nextPlay() {
		int cnt = 0;	// ����� ���� �ִ��� �������� �Ǻ�
		if (mp3.isPlaying()) {
			// ���� ������� �뷡�� �ִٸ� true
			// ���� ������� �뷡�� ���ٸ� false
			mp3.stop();
		}
		if (index < musicList.size() - 1) {
			index++;
			mp3.play(musicList.get(index).getPath());
		} else {
			cnt++;
		}
		
		return cnt;
		
	}
	
	public int beforePlay() {
		int cnt = 0;	// ����� ���� �ִ��� �������� �Ǻ�
		if (mp3.isPlaying()) {
			// ���� ������� �뷡�� �ִٸ� true
			// ���� ������� �뷡�� ���ٸ� false
			mp3.stop();
		}
		if (index > 0) {
			index--;
			mp3.play(musicList.get(index).getPath());
		} else {
			cnt++;
		}
		
		return cnt;

	}
	
	
}
