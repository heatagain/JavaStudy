package Exam03;

public class DollMain {

	public static void main(String[] args) {
		
		Machine ma = new Machine();
		Pika pika = new Pika();
		Piri piri = new Piri();
		Kkobuk kkobuk = new Kkobuk();
		
		// �ӽ��� ���ؼ� ��ī�� ������ �̰� �;��
		ma.getDoll(pika);
		ma.getDoll(piri);
		ma.getDoll(kkobuk);
		
	}

}
