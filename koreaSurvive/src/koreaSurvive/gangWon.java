package koreaSurvive;

import java.util.Random;

public class gangWon {
	//month �� 369�� ��ȸ�� �Ÿ��α� ��ũ��Ʈ, �������� �Ϲ� ��ũ��Ʈ
	Random ran = new Random();
	level lev = new level();
	subMethod sm = new subMethod();
	

	// ��ȣ�� ������
	// ��ħ
	// 1. ����ϱ� 2.��԰� ����ϱ� 3. 10�� �� �ڰ� �����ϱ�
	// ����
	// 1. ��Ա� 2. �����ڱ� 3. ����ȸ�� ���� ���ٶ���
	// ����
	// 1. ���ڱ� 2. �����ñ� 3. ���ø��� ����

	public int NurseMoring1(int month) { // ���ϰ��� �༭ �� ���ϰ��� �°� ü���̳� ���׷� ���� �� ����

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�ǰ��� �Ф� ����ϱ� �Ⱦ�");
				System.out.println("ü�� " + lev.getHpDown1()); // ������¹��� ���� //ü�°���
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("����ϴ� �濡 �Ϳ��� ����̸� �ô�");
				System.out.println("����� �������� �鿪�� " + lev.getResistanceUp1()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����Ϸ��µ� ������� ������");
				System.out.print("������� ���� Ÿ�� �� ü�� +" + lev.getHpUp1()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�ⲯ ����ߴµ� ����ũ�� �Ȱ����� �Դ�!");
				System.out.println("�ٽ� ���� ���� ����ũ�� �����Դ�...");
				System.out.println("ü�� " + lev.getHpDown1()); // ü�°���
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("����ϴ� �濡 �Ϳ��� ����̸� �ô�");
				System.out.println("����� �������� �鿪�� +" + lev.getResistanceUp1()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����Ϸ��µ� ������� ������");
				System.out.print("������� ���� Ÿ�� �� ü�� +" + lev.getHpUp1()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseMoring2(int month) {

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("���� �ʹ� ���ϰ� �Դٰ� ü�ߴ�!");
				System.out.println("ü�� -" + lev.getHpDown1()); // ü�� ����
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("������ ���ڷ� �ظԴ� ����¥����");
				System.out.println("���� �䵵�����ݾ�?");
				System.out.println("����� �������� �鿪�� +" + lev.getResistanceUp1()); // �鿪�� ����
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("���� ���� �Ծ �谡 �ٸ��� �Ÿ��� ��");
				System.out.println("�鿪�� " + lev.getResistanceDown1()); // �鿪�� ����
				sm.timeDelay(300);
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�Ÿ��α� ������ ������ ���� �ݾҴ�...");
				System.out.println("�����!!!");
				System.out.println("ü�� -" + lev.getHpDown1());// ü�� ����
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("������ ���ڷ� �ظԴ� ����¥����");
				System.out.println("���� �䵵�����ݾ�?");
				System.out.println("����� �������� �鿪�� +" + lev.getResistanceUp1()); // �鿪�� ����
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("���� ���� �Ծ �谡 �ٸ��� �Ÿ��� ��");
				System.out.println("�鿪�� " + lev.getResistanceDown1()); // �鿪�� ����
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseMoring3(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("������ �ߴµ� �ƹ��� ��ġä�� ���ߴ�!");
				System.out.println("10�� ���ڼ� �Ƿΰ� Ǯ�ȴ�");
				System.out.println("�鿪�� +" + lev.getResistanceUp1()); // �鿪�� ����
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�����ؼ� ��������� ���� �����٤̤�");
				System.out.println("�ܼҸ� 30�� �� ����� ����������...");
				System.out.println("�鿪�� " + lev.getResistanceDown1()); // �鿪�� ����
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("10�� �� �ܴٴ°� 2�ð� �� �ڹ��ȴ�");
				System.out.println("������ 15��...");
				System.out.println("�� ���� �������� �帥��...");
				System.out.println("�Ƿΰ� ��Ǯ���� ü�� +" + lev.getHpUp1()); // ü�� ����
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��ħ�� �������� �Ծ���!");
				System.out.print("�鿪�� +" + lev.getResistanceUp1());	// �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��ٱ濡 ���ְ��� ī�䰡 �ڷγ��� ���� ���ߴ�");
				System.out.print("ī���� ���븦 ���� ���׷� " + lev.getResistanceDown1()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��ħ�� �����!");
				System.out.print("���� ����ؼ� ü�� +" + lev.getHpUp1());
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseLaunch1(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�θ޻�� �ְ��� �������� �� �Ծ���");
				System.out.println("ü���� +" + lev.getHpUp2()); // ü������
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�� ������ ���µ� ������ ��� 30�� �ɾ��");
				System.out.println("����� �Ф�");
				System.out.println("ü���� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����ȸ���� ��ġ�� �־ �ű⼭ ������ �Ծ���");
				System.out.println("���� ��ŵ��� ���ɸ����� �ʹ� ���� �ּŤ��������ض�..");
				System.out.println("�鿪�� " + lev.getResistanceDown3());// �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�θ޻�� �ְ��� �������� �� �Ծ���");
				System.out.println("ü���� +" + lev.getHpUp2()); // ü������
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�Ÿ��α� ������ ������ �� ���� �ݾ� �� ������ �ߴ�");
				System.out.println("����� �Ф�");
				System.out.println("ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����ȸ���� ��ġ�� �־ �ű⼭ ������ �Ծ���");
				System.out.println("���� ��ŵ��� ���ɸ����� �ʹ� ���� �ּŤ��������ض�..");
				System.out.println("�鿪�� " + lev.getResistanceDown3());// �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseLaunch2(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�ʹ��ǰ���~ ���� ��ŵ�Ѵ�!!");
				System.out.println("zzZZ~ �� �����ϴ�!");
				System.out.println("���׷� +" + lev.getResistanceUp2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("���� �ڼ� �����ϱ��ѵ� �ʹ� ����ļ� ���� ����...");
				System.out.println("ü�� " + lev.getHpDown3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�����ڷ��µ� ������� ������ �ɺθ��� ���״�");
				System.out.println(" ^_^ �ϴð��� ����� ���� ������");
				System.out.println("�ǰ��� ü�� " + lev.getHpDown2());// ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�ʹ��ǰ���~ ���� ��ŵ�Ѵ�!!");
				System.out.println("zzZZ~ �� �����ϴ�!");
				System.out.println("���׷� +" + lev.getResistanceUp2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("���� �ڼ� �����ϱ��ѵ� �ʹ� ����ļ� ���� ����...");
				System.out.println("ü�� " + lev.getHpDown3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�����ڷ��µ� ������� ������ �ɺθ��� ���״�");
				System.out.println(" ^_^ �ϴð��� ����� ���� ������");
				System.out.println("�ǰ��� ü�� " + lev.getHpDown2());// ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseLaunch3(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("���� ��ŵ����� �̻ݹ޴´�");
				System.out.println("�뵷�� ����ֽŴ�");
				System.out.println("��� �ְ��� �鿪�� +" + lev.getResistanceUp3()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("���� ��ŵ����� ��ȥ�� ������? �󶼴� ���� �޺��� �¾Ҵ�");
				System.out.println("����ȸ������ �����ƴ�!");
				System.out.println("����� ������ �鿪�� " + lev.getResistanceDown2());// �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����ȸ�� ���±濡 ���� ���ָӴ����� ��������");
				System.out.println("���ָӴ����� 1�ð� ���� �ܼҸ��� �����");
				System.out.println("�ǰ��� ü�� " + lev.getHpDown3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("���� ��ŵ����� �̻ݹ޴´�");
				System.out.println("�뵷�� ����ֽŴ�");
				System.out.println("��� �ְ��� �鿪�� +" + lev.getResistanceUp3()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("���� ��ŵ����� ��ȥ�� ������? �󶼴� ���� �޺��� �¾Ҵ�");
				System.out.println("����ȸ������ �����ƴ�!");
				System.out.println("����� ������ �鿪�� " + lev.getResistanceDown2());// �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����ȸ�� ������� ����ũ�� �ȳ��� ��ȭ�� �Ѵ�");
				System.out.println("�Ÿ��α� �����̶�� ������� ��ġ�ٰ� ��¦�� �¾Ҵ�");
				System.out.println("ü�� " + lev.getHpDown3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;

		} else {
			return select;
		}
	}

	public int NurseNight1(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("ǫ ���");
				System.out.println("���� ����������~");
				System.out.println("ü�� "); // ü������
				System.out.println("�鿪�� "); // �鿪�� ����
			} else if (select == 1) {
				System.out.println("�� �ڴٰ� ������ ���ȴ�!");
				System.out.println("�ͽ� ������!");
				System.out.println("�ǰ��ϴ� ü�� ");// ����
				System.out.println("���׷� ");// ����
			} else if (select == 2) {
				System.out.println("���Ϸ��� ���峵�� ���� �ʹ� ���");
				System.out.println("������� ���鼭 ��� ���� �ɷȳ�..?");
				System.out.println("�鿪�� "); // �鿪�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("ǫ ���");
				System.out.println("���� ����������~");
				System.out.println("ü�� "); // ü������
				System.out.println("�鿪�� "); // �鿪�� ����
			} else if (select == 1) {
				System.out.println("�� �ڴٰ� ������ ���ȴ�!");
				System.out.println("�ͽ� ������!");
				System.out.println("�ǰ��ϴ� ü�� ");// ����
				System.out.println("���׷� ");// ����
			} else if (select == 2) {
				System.out.println("���Ϸ��� ���峵�� ���� �ʹ� ���");
				System.out.println("������� ���鼭 ��� ���� �ɷȳ�..?");
				System.out.println("�鿪�� "); // �鿪�� ����
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseNight2(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("���� ���ڿ��� ������ ģ��");
				System.out.println("���ַ� ���� ������ �ҵ��ߴ�");
				System.out.println("�鿪�� "); // �鿪�� ����
			} else if (select == 1) {
				System.out.println("ģ���� �������� ������~");
				System.out.print("����� �������� ü�� "); // ü������
			} else if (select == 2) {
				System.out.println("�̽ñ��� �� ������ ������...");
				System.out.print("ü�� "); // ü�� ����
				System.out.print("���׷� "); // ���׷� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("���� ���ڿ��� ������ ģ��");
				System.out.println("���ַ� ���� ������ �ҵ��ߴ�");
				System.out.println("�鿪�� "); // �鿪�� ����
			} else if (select == 1) {
				System.out.println("ģ���� �������� ������~");
				System.out.print("����� �������� ü�� "); // ü������
			} else if (select == 2) {
				System.out.println("�̽ñ��� �� ������ ������...");
				System.out.print("ü�� "); // ü�� ����
				System.out.print("���׷� "); // ���׷� ����
			}
			return select;
		} else {
			return select;
		}
	}

	public int NurseNight3(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("���� ������ ���ø��� ���°� �ְ���~");
				System.out.println("ü�� "); // ü�� ����
				System.out.println("�濪��Ģ�� ���� �鿪�� "); // �鿪�� ����
			} else if (select == 1) {
				System.out.println("�ƴ� �ð��� ����..?");
				System.out.println("���ø��� ���ٰ� �����̴�!");
				System.out.println("�ǰ��� �Ф� ü�� "); // ü�� ����
			} else if (select == 2) {
				System.out.println("���ø��� ���ٰ� ��û�Ҹ� �ϳ��� ���ߴ�");
				System.out.println("���ȿ� �ĸ��� ���δ�");
				System.out.println("�鿪�� "); // �鿪�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("���� ������ ���ø��� ���°� �ְ���~");
				System.out.println("ü�� "); // ü�� ����
				System.out.println("�濪��Ģ�� ���� �鿪�� "); // �鿪�� ����
			} else if (select == 1) {
				System.out.println("�ƴ� �ð��� ����..?");
				System.out.println("���ø��� ���ٰ� �����̴�!");
				System.out.println("�ǰ��� �Ф� ü�� "); // ü�� ����
			} else if (select == 2) {
				System.out.println("���ø��� ���ٰ� ��û�Ҹ� �ϳ��� ���ߴ�");
				System.out.println("���ȿ� �ĸ��� ���δ�");
				System.out.println("�鿪�� "); // �鿪�� ����
			}
			return select;
		} else {
			return select;
		}
	}
	
	//����� �ð�
	//��ħ
	// 1. ��ħ� 2. ���� ��å���� 3. ��԰� ����ϱ�
	//����
	// 1. ���ɿ 2. ��Ա� 3. �����ڱ�
	//����
	// 1. ���� 2. ������ �ڱ� 3. ��갡��

	public int AthleteMorning1(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
																												// ��

			if (select == 0) {
				System.out.println("��� ���������!");
				System.out.println("����� ���� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��ӿ� ������ �߳�...");
				System.out.println("���� ���ļ� �鿪�� " + lev.getResistanceDown1());
				System.out.println();
				sm.timeDelay(300);// ���׷� ����
			} else if (select == 2) {
				System.out.println("��� �ʹ� �����ؼ� ���ɽð� ���� ����ߴ�...");
				System.out.println("������ ������ ���ʸ��� �鿪�� " + lev.getResistanceDown2()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("��� ���������!");
				System.out.println("����� ���� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��ӿ� ������ �߳�...");
				System.out.println("���� ���ļ� �鿪�� " + lev.getResistanceDown1()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�̽ñ��� ��� ���̴�!!!");
				System.out.println("������!!!"); // �鿪�� ����
				System.out.println("�����ؼ� �鿪�� " + lev.getResistanceDown2());
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}

	}

	public int AthleteMorning2(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("��å�� ���ٰ� �ٸ��� �߲�!");
				System.out.println("��а� ��� ���ؼ� ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�ð��� ���⸦ �޾Ҵ�!!!");
				System.out.println("�ð��� ���⸦ �޾� �鿪�� +" + lev.getResistanceUp2()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��å�� ���ٰ� ���� �����ƴ�!");
				System.out.println("���� �����̿��� ���� ���� ��... �鿪�� " + lev.getResistanceDown1()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("��å�� ���ٰ� �ٸ��� �߲�!");
				System.out.println("��а� ��� ���ؼ� ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��å���� ���� �ֹε��� �ڷγ��� �а��Ͽ� ����ũ�� ���Ѵ�!!");
				System.out.println("������� �������� �鿪�� +" + lev.getResistanceUp2()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��å�� ���ٰ� ���� �����ƴ�!");
				System.out.println("���� �����̿��� ���� ���� ��... �鿬�� " + lev.getResistanceDown1()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteMorning3(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("��ħ�� �߰���������!");
				System.out.println("ü�� +"  + lev.getHpUp1()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��ħ�� �Ұ����!");
				System.out.println("ü�� +" + lev.getHpUp3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�ѱ����� ���!");
				System.out.println("����ؼ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("��ħ�� �߰���������!");
				System.out.println("ü�� +"  + lev.getHpUp1()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�̽ñ��� �� �߸Ծ����!");
				System.out.println("ü�� +" + lev.getHpUp3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�ѱ����� ���!");
				System.out.println("����ؼ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteLaunch1(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("��� ���� �����!!");
				System.out.println("��� �ؼ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��� ������ ������ ���� �Ĵ��� ���� �Ǿ���.");
				System.out.println("��ġ���� ��� ������ ���׷� " + lev.getResistanceDown2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����� ���� ������ ������ ��ߴ�!");
				System.out.println("�鿪�� +" + lev.getResistanceUp3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("��� ���� �����!!");
				System.out.println("��� �ؼ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��� ������ ������ ���� �Ĵ��� ���� �Ǿ���.");
				System.out.println("��ġ���� ��� ������ ���׷� " + lev.getResistanceDown2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��� �ϰ� �;����� ����ũ�� �ΰ�ͼ� ���� ���ƿԴ�");
				System.out.println("�鿪�� +" + lev.getResistanceUp3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteLaunch2(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("�亸�� �����!!");
				System.out.println("���� �ȸԾ ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("���ɿ� �ܹ���!");
				System.out.println("�ܹ����� �Ծ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��簡 �߰������� ����Ծ���");
				System.out.println("......�Ѥ� " + lev.getResistanceUp3()); // �鿪�� ���� 
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("�亸�� �����!!");
				System.out.println("���� �ȸԾ ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("���ɿ� �ܹ���!");
				System.out.println("�ܹ����� �Ծ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��簡 �߰������� ����Ծ���");
				System.out.println("......�Ѥ� " + lev.getResistanceUp3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteLaunch3(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("�Ẹ�� �����!!");
				System.out.println("��� �ؼ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("30�и� �ڷ����� 4�ñ��� �ڹ��ȴ�! ");
				System.out.println("������ ���ʸ��� �޾� �鿪�� " + lev.getResistanceDown3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�޿��� ��� �Ͽ���!");
				System.out.println("����� ���Ƽ� �鿪�� +" + lev.getResistanceUp3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("�Ẹ�� �����!!");
				System.out.println("��� �ؼ� ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("30�и� �ڷ����� 4�ñ��� �ڹ��ȴ�! ");
				System.out.println("������ ���ʸ��� �޾� �鿪�� " + lev.getResistanceDown3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�޿��� ��� �Ͽ���!");
				System.out.println("����� ���Ƽ� �鿪�� +" + lev.getResistanceUp3()); // �鿪�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteNight1(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("�ڱ����� ��ϴ°� �ְ�!!");
				System.out.println("���������� �ڱ������� ��� �����Ƽ� �鿪�� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("�ð��� �꽺���� �ְ���!!");
				System.out.println("����� ü��"); // ü�� ����
			} else if (select == 2) {
				System.out.println("3�� 1000 ����!!!!");
				System.out.println("����...."); // �鿪�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("�ڱ����� ��ϴ°� �ְ�!!");
				System.out.println("���������� �ڱ������� ��� �����Ƽ� �鿪�� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("�ð��� �꽺���� �ְ���!!");
				System.out.println("����� ü��"); // ü�� ����
			} else if (select == 2) {
				System.out.println("3�� 1000 ����!!!!");
				System.out.println("����...."); // �鿪�� ����
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteNight2(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("������ �پ��!");
				System.out.println("ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("���� ���ٰ� �߻��� ���ϸ� ������!");
				System.out.println("��� �鿪�� "); // �鿪�� ����
			} else if (select == 2) {
				System.out.println("������ �������� ǫ ������.");
				System.out.println("���� �ְ��!"); // �鿪�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("��ȸ�� �Ÿ��α�� ���� ���� ����.");
				System.out.println("ü�� "); // ü�� ����
			} else if (select == 1) {
				System.out.println("���� ���ٰ� �߻��� ���ϸ� ������!");
				System.out.println("��� �鿪�� "); // �鿪�� ����
			} else if (select == 2) {
				System.out.println("������ �������� ǫ ������.");
				System.out.println("���� �ְ��!"); // �鿪�� ����
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteNight3(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
			// ��
			
			if (select == 0) {
				System.out.println("��굵 �����!");
				System.out.println("���� ���⸦ �޾� �鿪�� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("���� �����ٰ� �ݴް��� ������.");
				System.out.println("�ڵ� �Ⱥ��� �ٴ��� ü��"); // ü�� ����
			} else if (select == 2) {
				System.out.println("��갴���� ����ũ�� �Ⱦ��� �ٴѴ� �Ѥ�.");
				System.out.println("���� ��갴�� ������ �鿪�� "); // �鿪�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("�꿡 �����ߴµ� ����ũ�� �Ҿ���� �����ܼӿ� �ɷȴ�.");
				System.out.println("����ũ�� �Ҿ���� �鿪�� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("���� �����ٰ� �ݴް��� ������.");
				System.out.println("�ڵ� �Ⱥ��� �ٴ��� ü��"); // ü�� ����
			} else if (select == 2) {
				System.out.println("��갴���� ����ũ�� �Ⱦ��� �ٴѴ� �Ѥ�.");
				System.out.println("���� ��갴�� ������ �鿪�� "); // �鿪�� ����
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	//�ð� ���л�
	// ���� ������
	// 1. �����ڱ� 2.��ħ�԰� �б����� 3. ��� �����ֱ�.

	// ���� ������
	// 1. �нĸԱ� 2. ���� ����. 3. �����ϱ�

	// ���� ������
	// 1. �ó��� ������ ���. 2. ������ �޽� 3. �����
	
	public int StudentMorning1(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // �̺�Ʈ ����
																												// ��

			if (select == 0) {
				System.out.println("ǫ�ڰ� �Ͼ���� �������� ������ ���ȴ�!");
				System.out.println("������ �ڼ� ���׷��� +" + lev.getResistanceUp2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("������ �ڹ����� �Ѵ���� ������ ���ƴ�!");
				System.out.println("�б����� �پ�� ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�����ڴٰ� ���ϰ� �غ��ϴٰ� ���ο� �߰����� ������!");
				System.out.println("�̳� ����... ü�� " + lev.getHpDown3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // ��ȸ�� �Ÿ��α�
			if (select == 0) {
				System.out.println("ǫ�ڰ� �Ͼ���� �������� ������ ���ȴ�!");
				System.out.println("������ �ڼ� ���׷��� +" + lev.getResistanceUp2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("������ ������ ���ݼ����̾���!");
				System.out.println("���ݼ��� �ְ�! ������ ������ �־ ü�� " + lev.getHpDown2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�����ڴٰ� ���ϰ� �غ��ϴٰ� ���ο� �߰����� ������!");
				System.out.println("�̳� ����... ü�� " + lev.getHpDown3()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}

	}

	public int StudentMorning2(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�ѱ����� �������!!!");
				System.out.println("���� �ְ�! ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�б��� �����ߴµ� ����ũ�� �Ҿ���ȴ�!");
				System.out.println("����ũ�� ���� ���׷��� " + lev.getResistanceDown2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�б����±濡 �汸���� ���� �ҵ��� �Ǿ���!");
				System.out.println("�Ѿƾƾƾƾ�!!! ���׷� +" + lev.getResistanceUp2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		}

		else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�ѱ����� �������!!!");
				System.out.println("���� �ְ�! ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�б��� �����ߴµ� ����ũ�� �Ҿ���ȴ�!");
				System.out.println("����ũ�� ���� ���׷��� " + lev.getResistanceDown2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("����ũ�� �����Ͽ� ���� �ܼӿ� �ɷȴ�");
				System.out.println("�������� ��� ���׷��� " + lev.getResistanceUp2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int StudentMorning3(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			if (select == 0) {
				System.out.println("�θ���� ���� �������� ������� �ߴ�.");
				System.out.println("ȿ���� ������ ü�°� ���׷� +" + lev.getResistanceUp1()); // ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��縦 �����ִٰ� �߻��� ���ϸ� ������!");
				System.out.println("���ϸ� ���� �ɽ��� ���ؼ� ���׷� " + lev.getResistanceDown2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("��縦 �����ִٰ� �б��� �����ߴ�!");
				System.out.println("�б����� �پ�� ü�� " + lev.getHpDown2());// ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�θ���� ���� �������� ������� �ߴ�.");
				System.out.println("ȿ���� ������ ü�°� ���׷� +" + lev.getResistanceUp1()); // ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("��縦 �����ִٰ� �߻��� ���ϸ� ������!");
				System.out.println("���ϸ� ���� �ɽ��� ���ؼ� ���׷� " + lev.getResistanceDown2()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("���ϴٰ� ��� ����ũ�� �����µ� �ܼӿ� �ɷȴ�!");
				System.out.println("��� �������� 3�ܺ����� �¾Ƽ� ü�� " + lev.getHpDown2());// ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int StudentLaunch1(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			if (select == 0) {
				System.out.println("��ġ...����...��ġ...");
				System.out.println("���̼����� ǳ���Ͽ� ���׷� +" + lev.getResistanceUp2());// ���׷� �߰�.
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("������ �ڸ��� �������� �����̴�!");
				System.out.println("ü��..... ���׷� " + lev.getResistanceDown3()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�нĿ� �ѿ찡!!!");
				System.out.println("�����������!!!! ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��ġ...����...��ġ...");
				System.out.println("���̼����� ǳ���Ͽ� ���׷� +" + lev.getResistanceUp2());// ���׷� �߰�.
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("������ �ڸ��� �������� �����̴�!");
				System.out.println("ü��..... ���׷� " + lev.getResistanceDown3()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("ģ���� ������ �ɾƼ� ���� �Ծ���");
				System.out.println("��ĭ�� ��� �ɱ� �ʼ�!! ü�� +" + lev.getHpUp2()); // ü�� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}

	}

	public int StudentLaunch2(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�������� ���ڵ巡��!");
				System.out.println("����!!! ü�� +" + lev.getHpUp1() + "���׷� +" + lev.getResistanceUp1()); // ü��, ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�б��� ���ư��� ������ ������ ���ƴ�!");
				System.out.println("�б����� ��� ����... ���׷�" + lev.getResistanceDown3()); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("������ ����� ���� ��� ���ϰ� ���� �Ծ���.");
				System.out.println("����� ���� ��� ���׷� ");// ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�������� ���ڵ巡��!");
				System.out.println("����!!! "); // ü��, ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("�Ÿ��α� ����Ű��?");
				System.out.println("���Ѿ���? "); // ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("�Ÿ��α� ����Ű��?");
				System.out.println("���Ѿ���? ");// ���׷� ����
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else {
			return select;
		}
	}

	public int StudentLaunch3(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�ѱ����� ����̰Ŵ�....");
				System.out.println("�����ϴ��� ���� ���Ծ� ü�� ");// ü�� ����
			} else if (select == 1) {
				System.out.println("�������� �������� ��Ư�ϴٰ� �̸� A+ �� �̴ּ�");
				System.out.println("����� ���� ���׷��� "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("������ �ϴ� �߿� ������ �߰��Ǿ���.");
				System.out.println("������......"); // ü�� ���׷� ����
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("��ȸ�� �Ÿ��α�� ����ũ�� �ʼ�!");
				System.out.println("..������ ����ũ�� �ΰ�ͼ� ī�信�� �i�ܳ���.");
				System.out.println("�i�ܳ� ������ ��ó�� �޾� ");// ü�� ����
			} else if (select == 1) {
				System.out.println("�������� �������� ��Ư�ϴٰ� �̸� A+ �� �̴ּ�");
				System.out.println("����� ���� ���׷��� "); // ���׷� ����
			} else if (select == 2) {
				System.out.println("������ �ϴ� �߿� ������ �߰��Ǿ���.");
				System.out.println("������......"); // ü�� ���׷� ����
			}
			return select;
		} else {
			return select;
		}
	}

	public int StudentNight1(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("ģ���� �������� ������~");
				System.out.println("����� ������ "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("����� ����...? ��.. ���� �ð�����..");
				System.out.println("�ð��� �ó��� ��������!"); // ���׷� ����
			} else if (select == 2) {
				System.out.println("�ڷγ��� �����Ǿ� ���±濡 ���ƿԴ�");
				System.out.println("�ð��̾ ����! "); // ���׷� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("ģ���� �������� ������~");
				System.out.println("����� ������ "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("����� ����...? ��.. ���� �ð�����..");
				System.out.println("�ð��� �ó��� ��������!"); // ���׷� ����
			} else if (select == 2) {
				System.out.println("�濪��Ģ ��Ŵ");
				System.out.println("�ð��̿��� ���� "); // ���׷� ����
			}
			return select;
		} else {
			return select;
		}
	}

	public int StudentNight2(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�Ѵ���� ������ ������ Ÿ�� ���� �Դ�!");
				System.out.println("���� �ְ�! "); // ü�� ����
			} else if (select == 1) {
				System.out.println("�Ѵ���� ������ ���ƴ�!");
				System.out.println("������ �ɾ�ٰ��� ������ �ɷ� ");// ���׷� ����
			} else if (select == 2) {
				System.out.println("������ �ɾ�ٰ� �߻��� ���ϸ� ������!");
				System.out.println("�߻��� ���ϴ� �ο��� �ɾ�Դ�!!");
				System.out.println("���Ͽ��� �����Ͽ� ü�� ");// ü�� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�Ѵ���� ������ ������ Ÿ�� ���� �Դ�!");
				System.out.println("���� �ְ�! "); // ü�� ����
			} else if (select == 1) {
				System.out.println("�Ѵ���� ������ ���ƴ�!");
				System.out.println("������ �ɾ�ٰ��� ������ �ɷ� ");// ���׷� ����
			} else if (select == 2) {
				System.out.println("������ �ɾ�ٰ� �߻��� ���ϸ� ������!");
				System.out.println("�߻��� ���ϴ� �ο��� �ɾ�Դ�!!");
				System.out.println("���Ͽ��� �����Ͽ� ü�� ");// ü�� ����
			}
			return select;
		} else {
			return select;
		}
	}

	public int StudentNight3(int month) {
		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("�꽺���� �ְ�!");
				System.out.println("����� ���⸦ �޾� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("��� ���� ģ���� ���� ���� ���÷� ����.");
				System.out.println("���̾�Ʈ�� ���Ϻ�����~ ");// ü��, ���׷� ����
			} else if (select == 2) {
				System.out.println("��� ���� ������ ������ ���� ������");
				System.out.println("�������� ��Ʈ������ ");// ���׷� ����
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("�꽺���� �ְ�!");
				System.out.println("����� ���⸦ �޾� "); // ���׷� ����
			} else if (select == 1) {
				System.out.println("��� ���� ģ���� ���� ���� ���÷� ����.");
				System.out.println("�濪��Ģ ����Ű��??????? ��?!");
				System.out.println("��Ű��� ��!");// ü��, ���׷� ����
			} else if (select == 2) {
				System.out.println("��� ���� ������ ������ ���� ������");
				System.out.println("�������� ��Ʈ������ ");// ���׷� ����
			}
			return select;
		} else {
			return select;
		}
	}
}

