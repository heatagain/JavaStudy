import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		
		// ArrayList
		// ArrayList ���� ���
		// ArrayList<Ÿ��> �̸� = new ArrayList<Ÿ��>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// �� �߰�! �̸�.add("�� ��");
		arrayList.add("��ȯ");
		arrayList.add("����");
		arrayList.add("����");
		
		// ���ϴ� ��ġ�� �� �߰�! -> ����
		arrayList.add(1, "�°�");
		
		// �� ����! -> .remove(�ε���);
		arrayList.remove(arrayList.size()-1);
		arrayList.remove(1);
		arrayList.remove(1);
		
		// arrayList ���
		// arrayList�� ũ�� -> size()
		for(int i = 0; i < arrayList.size(); i++) {
			// �� �������� -> �̸�.get(index)
			System.out.println(arrayList.get(i));
		}
		

	}

}
