package koreaSurvive;

import java.util.Random;
import java.util.Scanner;

public class koreaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		koreaDb db = new koreaDb();
		koreaMember km = new koreaMember();
		subMethod sm = new subMethod();
		characterControl cc = new characterControl();
		nurse ns = new nurse();
		hellChang hell = new hellChang();
		student stu = new student();
		location lo = new location();
		level lev = new level();
		probabilityControl pc = new probabilityControl();
		art art = new art();
		seoulProvince sp = new seoulProvince();
		gangWon gw = new gangWon();

		boolean nurCheck = false;
		boolean stuCheck = false;
		boolean hellCheck = false;
		boolean seoulCheck = false;
		boolean provinceCheck = false;
		boolean gangWonCheck = false;
		boolean omi = false;

		int month = 1;
		int dis = 0; // �Ÿ��α� �ܰ�

		art.getStart2021();
		sm.timeDelay(1000);
		art.getKs();
		sm.timeDelay(500);

		// System.out.println("====Menu====");

		// km.memberMenu(); // ��� ��� ���� �޴�

		while (true && cc.life) {
			while (true) {
				System.out.println("=========���� ����=========");
				System.out.println("1.������ 2.���� 3.����");
				System.out.print("�Է� >> ");
				int menu = sc.nextInt();
				if (menu == 1) {
					System.out.println("������ ���� �Ϸ�!");
					cc.setResistance(lev.getEasy()); // ������� �⺻ ���׷� ����
					lev.levelSelect(1);
					cc.setGangWonResistance();
					gangWonCheck = true;
					System.out.println();
					sm.timeDelay(300);
					System.out.println("û�� ����� ���� ���׷��� �߰��ƽ��ϴ�");
					System.out.println("�ٸ� �������� �����ϴ�");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;
				} else if (menu == 2) {
					System.out.println("���� ���� �Ϸ�!");
					cc.setResistance(lev.getNormal());
					lev.levelSelect(2);
					cc.setProvinceResistance();
					provinceCheck = true;
					System.out.println();
					sm.timeDelay(300);
					System.out.println("���� �α��� ���� ���׷��� �߰��ƽ��ϴ�");
					System.out.println("���ﺸ�� �����ϴ�");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;
				} else if (menu == 3) {
					System.out.println("���� ���� �Ϸ�!");
					cc.setResistance(lev.getHard());
					lev.levelSelect(3);
					System.out.println();
					cc.setSeoulResistance();
					seoulCheck = true;
					System.out.println();
					sm.timeDelay(300);
					System.out.println("���� �α� �������� ���� ���׷� ��庥Ƽ���� �����ϴ�");
					System.out.println("��Ƴ����ʽÿ�");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;
				} else {
					System.out.println("�ٽ� �Է��ϼ���!");
					System.out.println();
					System.out.println();
				}
			}
			while (true) {
				System.out.println("===========ĳ���� ����==========");
				System.out.println("1.����� 2.��ȣ�� 3.�л�");
				System.out.print("�Է� >> ");
				int menu = sc.nextInt();

				if (menu == 1) {
					System.out.println("����� ���� �Ϸ�!");
					sm.timeDelay(300);
					hell.hell();
					hellCheck = true;
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;

				} else if (menu == 2) {
					System.out.println("��ȣ�� ���� �Ϸ�!");
					sm.timeDelay(300);
					ns.nurse();
					nurCheck = true;
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;

				} else if (menu == 3) {
					System.out.println("�л� ���� �Ϸ�!");
					sm.timeDelay(300);
					stu.stu();
					stuCheck = true;
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;

				} else {
					System.out.println("�ٽ� �Է��ϼ���!");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
				}
			}
			break;
		}

		// 1�� 12�� ����
		while (month <= 12 && cc.life) {
			
			dis++;

			boolean inside = false;
			boolean outside = false;

			cc.setDefaultInfection(); // ������, ���׷� �ʱ�ȭ
			if (nurCheck) {
				cc.setDefaultNurseResistance();
			} else {
				cc.setDefaultResistance();
			}
			if (seoulCheck) {
				cc.setSeoulResistance();
			} else if (provinceCheck) {
				cc.setProvinceResistance();
			} else if (gangWonCheck) {
				cc.setGangWonResistance();
			}

			if (month >= 6) { // 6�� ���ķ� ����ũ�� ���� ���� ����
				if (pc.probability(20)) {
					cc.setInfection(50);
					omi = true;
					System.out.println("=============================");
					System.out.println("      ����ũ�� ���� ����!!!!     ");
					System.out.println("=============================");
					System.out.println("   ���̷��� ������ 50% ����!!    ");
					sm.timeDelay(300);
					System.out.println("      ü�� ������ ����!!");
					System.out.println();
					System.out.println();
					lev.getOmiHpDown1();
					lev.getOmiHpDown2();
					lev.getOmiHpDown3();
				}

			}
			if (month == 4 || month == 8) { // ������ ü�� ������ ����
				System.out.println("=============================");
				System.out.println("         ������ ����!!!!     ");
				System.out.println("=============================");
				sm.timeDelay(300);
				System.out.println("      ü�� ������ ����!!");
				lev.getBigHpDown1();
				lev.getBigHpDown2();
				lev.getBigHpDown3();
			}

			if (gangWonCheck && nurCheck) {

			}

			while (provinceCheck || seoulCheck) { // ����, ����
				int inputMenu;

				if (nurCheck) { // ��ȣ�� ��ħ
					System.out.println("====== ��ħ �ൿ ���� ======");
					System.out.println("1.10�� ���ڰ� ����ϱ� 2.�İ� ����ϱ� 3.��԰� ����ϱ�");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.NurseMoring1(month);
						break;
					} else if (inputMenu == 2) {
						sp.NurseMoring2(month);
						break;
					} else if (inputMenu == 3) {
						sp.NurseMoring3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				else if (hellCheck) { // ����� ��ħ
					System.out.println("====== ��ħ �ൿ ���� ======");
					System.out.println("1.10�� ���ڰ� ����ϱ� 2.�İ� ����ϱ� 3.��ħ��ϱ�");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.AthleteMoring1(month);
						break;
					} else if (inputMenu == 2) {
						sp.AthleteMoring2(month);
						break;
					} else if (inputMenu == 3) {
						sp.AthleteMoring3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}
				}

				else if (stuCheck) { // �л� ��ħ
					System.out.println("====== ��ħ �ൿ ���� ======");
					System.out.println("1.��ϱ� 2.�� �԰� ��ϱ� 3.�� ���� 1���� �Ȱ�!");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.StudentMorning1(month);
						break;
					} else if (inputMenu == 2) {
						sp.StudentMorning2(month);
						break;
					} else if (inputMenu == 3) {
						sp.StudentMorning3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				///////////////////////// ����

				if (nurCheck) { // ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.�����Ĵ簡�� 2.���� ã�ư��� 3.«���� ��ϱ�");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.NurseLaunch1(month);
						break;
					} else if (inputMenu == 2) {
						sp.NurseLaunch2(month);
						break;
					} else if (inputMenu == 3) {
						sp.NurseLaunch3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}
				}

				else if (hellCheck) {
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.��Ա� 2.��ϱ� 3.��Ȱġ��");
					inputMenu = sc.nextInt();
					if (inputMenu == 1) {
						sp.AthleteLaunch1(month);
						break;
					} else if (inputMenu == 2) {
						sp.AthleteLaunch2(month);
						break;
					} else if (inputMenu == 3) {
						sp.AthleteLaunch3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				else if (stuCheck) {
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.�нĸԱ� 2.����Ž�� 3.�����");
					inputMenu = sc.nextInt();
					if (inputMenu == 1) {
						sp.StudentLaunch1(month);
						break;
					} else if (inputMenu == 2) {
						sp.StudentLaunch2(month);
						break;
					} else if (inputMenu == 3) {
						sp.StudentLaunch3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				///////////////////////////// ����

				if (nurCheck) {
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.Į���ϰ� ǫ���� 2.ģ�������� 3.�����");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.NurseNight1(month);
						break;
					} else if (inputMenu == 2) {
						sp.NurseNight2(month);
						break;
					} else if (inputMenu == 3) {
						sp.NurseNight3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				else if (hellCheck) {
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.Į���ϰ� ǫ���� 2.ģ�������� 3.�����");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.AthleteNight1(month);
						break;
					} else if (inputMenu == 2) {
						sp.AthleteNight2(month);
						break;
					} else if (inputMenu == 3) {
						sp.AthleteNight3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				else if (stuCheck) {
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.�����ñ� 2.Ŭ������ 3.�����ϱ�");
					inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						sp.StudentNight1(month);
						break;
					} else if (inputMenu == 2) {
						sp.StudentNight2(month);
						break;
					} else if (inputMenu == 3) {
						sp.StudentNight3(month);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}
				}
			}

			while (gangWonCheck) { // ������ �ݺ���
				
				System.out.println("============= " + dis + "�� ============");
				while (nurCheck) {
					// ��ħ
					System.out.println("====== ��ħ �ൿ ���� ======");
					System.out.println("1.����ϱ� 2.��԰� ����ϱ� 3.10�� �� �ڰ� �����ϱ�");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.NurseMoring1(month) == 0) {
							cc.setHp(lev.getHpDown1());
						} else if (gw.NurseMoring1(month) == 1) {
							cc.setResistance(lev.getResistanceUp1());
						} else if (gw.NurseMoring1(month) == 2) {
							cc.setHp(lev.getHpUp1());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.NurseMoring2(month) == 0) {
							cc.setHp(lev.getHpDown1());
						} else if (gw.NurseMoring2(month) == 1) {
							cc.setResistance(lev.getResistanceUp1());
						} else if (gw.NurseMoring2(month) == 2) {
							cc.setHp(lev.getResistanceDown1());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.NurseMoring3(month) == 0) {
							cc.setResistance(lev.getResistanceUp1());
						} else if (gw.NurseMoring3(month) == 1) {
							cc.setResistance(lev.getResistanceDown1());
						} else if (gw.NurseMoring3(month) == 2) {
							cc.setHp(lev.getHpUp1());
						}

						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}
				}

				while (hellCheck) {
					// ��ħ
					System.out.println("====== ��ħ �ൿ ���� ======");
					System.out.println("1.��ħ� 2.���� ��å���� 3.��԰� ����ϱ�");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.AthleteMorning1(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.AthleteMorning1(month) == 1) {
							cc.setResistance(lev.getResistanceDown1());
						} else if (gw.AthleteMorning1(month) == 2) {
							cc.setResistance(lev.getResistanceDown2());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.AthleteMorning2(month) == 0) {
							cc.setHp(lev.getHpDown2());
						} else if (gw.AthleteMorning2(month) == 1) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.AthleteMorning2(month) == 2) {
							cc.setResistance(lev.getResistanceDown1());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.AthleteMorning3(month) == 0) {
							cc.setHp(lev.getHpUp1());
						} else if (gw.AthleteMorning3(month) == 1) {
							cc.setHp(lev.getHpUp3());
						} else if (gw.AthleteMorning3(month) == 2) {
							cc.setHp(lev.getHpUp2());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				while (stuCheck) {
					// ��ħ
					System.out.println("====== ��ħ �ൿ ���� ======");
					System.out.println("1.�����ڱ� 2.��ħ�԰� �б����� 3.��� �����ֱ�");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.StudentMorning1(month) == 0) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.StudentMorning1(month) == 1) {
							cc.setHp(lev.getHpDown2());
						} else if (gw.StudentMorning1(month) == 2) {
							cc.setHp(lev.getHpDown3());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.StudentMorning2(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.StudentMorning2(month) == 1) {
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.StudentMorning2(month) == 2) {
							cc.setResistance(lev.getResistanceUp2());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.StudentMorning3(month) == 0) {
							cc.setHp(lev.getHpUp1());
							cc.setResistance(lev.getResistanceUp1());
						} else if (gw.StudentMorning3(month) == 1) {
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.StudentMorning3(month) == 2) {
							cc.setHp(lev.getHpDown2());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				////////////////////////////// ����
				while (nurCheck) {
					// ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.��Ա� 2.�����ڱ� 3.����ȸ�� ���� ���ٶ���");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.NurseLaunch1(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.NurseLaunch1(month) == 1) {
							cc.setHp(lev.getHpDown2());
						} else if (gw.NurseLaunch1(month) == 2) {
							cc.setResistance(lev.getResistanceDown3());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.NurseLaunch2(month) == 0) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.NurseLaunch2(month) == 1) {
							cc.setHp(lev.getHpDown3());
						} else if (gw.NurseLaunch2(month) == 2) {
							cc.setHp(lev.getHpDown2());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.NurseLaunch3(month) == 0) {
							cc.setResistance(lev.getResistanceUp3());
						} else if (gw.NurseLaunch3(month) == 1) {
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.NurseLaunch3(month) == 2) {
							cc.setHp(lev.getHpDown3());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}
				while (hellCheck) {
					// ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.���ɿ 2.��Ա� 3.�����ڱ�");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.AthleteLaunch1(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.AthleteLaunch1(month) == 1) {
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.AthleteLaunch1(month) == 2) {
							cc.setResistance(lev.getResistanceUp3());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.AthleteLaunch2(month) == 0) {
							cc.setHp(lev.getHpDown2());
						} else if (gw.AthleteLaunch2(month) == 1) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.AthleteLaunch2(month) == 2) {
							cc.setResistance(lev.getResistanceUp3());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.AthleteLaunch3(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.AthleteLaunch3(month) == 1) {
							cc.setResistance(lev.getResistanceDown3());
						} else if (gw.AthleteLaunch3(month) == 2) {
							cc.setResistance(lev.getResistanceUp3());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}
				while (stuCheck) {
					// ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.�нĸԱ� 2.���� ���� 3.�����ϱ�");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.StudentLaunch1(month) == 0) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.StudentLaunch1(month) == 1) {
							cc.setResistance(lev.getResistanceDown3());
						} else if (gw.StudentLaunch1(month) == 2) {
							cc.setHp(lev.getHpUp2());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.StudentLaunch2(month) == 0) {
							cc.setHp(lev.getHpUp1());
							cc.setResistance(lev.getResistanceUp1());
						} else if (gw.StudentLaunch2(month) == 1) {
							cc.setResistance(lev.getResistanceDown3());
						} else if (gw.StudentLaunch2(month) == 2) {
							cc.setResistance(lev.getResistanceUp2());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.StudentLaunch3(month) == 0) {
							cc.setHp(lev.getHpDown1());
						} else if (gw.StudentLaunch3(month) == 1) {
							cc.setResistance(lev.getResistanceUp3());
						} else if (gw.StudentLaunch3(month) == 2) {
							cc.setResistance(lev.getResistanceDown3());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}

				////////////////////////// ������ ����
				while (nurCheck) {
					// ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.���ڱ� 2.�����ñ� 3.���ø��� ����");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.NurseNight1(month) == 0) {
							cc.setHp(lev.getHpUp2());
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.NurseNight1(month) == 1) {
							cc.setHp(lev.getHpDown2());
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.NurseNight1(month) == 2) {
							cc.setResistance(lev.getResistanceDown2());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.NurseNight2(month) == 0) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.NurseNight2(month) == 1) {
							cc.setHp(lev.getHpDown2());
						} else if (gw.NurseNight2(month) == 2) {
							cc.setHp(lev.getHpDown3());
							cc.setResistance(lev.getResistanceDown3());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.NurseNight3(month) == 0) {
							cc.setHp(lev.getHpUp3());
							cc.setResistance(lev.getResistanceUp3());
						} else if (gw.NurseNight3(month) == 1) {
							cc.setHp(lev.getHpDown2());
						} else if (gw.NurseNight3(month) == 2) {
							cc.setResistance(lev.getResistanceDown3());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}
				while (hellCheck) {
					// ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.���� 2.������ �ڱ� 3.��갡��");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.AthleteNight1(month) == 0) {
							cc.setResistance(lev.getResistanceDown1());
						} else if (gw.AthleteNight1(month) == 1) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.AthleteNight1(month) == 2) {
							cc.setResistance(lev.getResistanceDown3());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.AthleteNight2(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.AthleteNight2(month) == 1) {
							cc.setResistance(lev.getResistanceDown1());
						} else if (gw.AthleteNight2(month) == 2) {
							cc.setResistance(lev.getResistanceUp2());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.AthleteNight3(month) == 0) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.AthleteNight3(month) == 1) {
							cc.setHp(lev.getHpDown3());
						} else if (gw.AthleteNight3(month) == 2) {
							cc.setResistance(lev.getResistanceDown2());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}
				while (stuCheck) {
					// ����
					System.out.println("====== ���� �ൿ ���� ======");
					System.out.println("1.�ó��� ������ ��� 2.������ �޽� 3.�����");
					int inputMenu = sc.nextInt();

					if (inputMenu == 1) {
						if (gw.StudentNight1(month) == 0) {
							cc.setResistance(lev.getResistanceDown1());
						} else if (gw.StudentNight1(month) == 1) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.StudentNight1(month) == 2) {
							cc.setResistance(lev.getResistanceUp3());
						}
						break;
					} else if (inputMenu == 2) {
						if (gw.StudentNight2(month) == 0) {
							cc.setHp(lev.getHpUp2());
						} else if (gw.StudentNight2(month) == 1) {
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.StudentNight2(month) == 2) {
							cc.setHp(lev.getHpDown3());
						}
						break;
					} else if (inputMenu == 3) {
						if (gw.StudentNight3(month) == 0) {
							cc.setResistance(lev.getResistanceUp2());
						} else if (gw.StudentNight3(month) == 1) {
							cc.setHp(lev.getHpDown2());
							cc.setResistance(lev.getResistanceDown2());
						} else if (gw.StudentNight3(month) == 2) {
							cc.setResistance(lev.getHpDown3());
						}
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���");
					}

				}
				break;
			}

			sm.timeDelay(300);
			if (cc.life) {
				System.out.println();
				System.out.println("���� �ڷγ� ���׷� : " + cc.getDefaultResistance() + "%");
				sm.timeDelay(300);
				System.out.println("���� ü�� : " + cc.getDefaultHp());
				sm.timeDelay(300);

				if (cc.getDefaultHp() >= 0) {

				} else {
					System.out.println("ü���� �����ؼ� �׾����ϴ�..");
					sm.timeDelay(300);
					System.out.println("Ŭ���� ����...");
					art.getGameOver();
					cc.life = false;
					break;
				}

//				if (cc.getDefaultHp() >= 150) {
//					System.out.println("ü���� 150�� �Ѿ����ϴ�!!!!");
//					sm.timeDelay(300);
//					System.out.println("����� ������ ��â");
//					sm.timeDelay(300);
//					System.out.println("�ڷγ��� ����� �̱� �� �����ϴ�!");
//					sm.timeDelay(300);
//					art.getGameClear();
//
//					break;
//				}

				System.out.println("�ڷγ� �˻���...");
				sm.timeDelay(1500);
				if (pc.probability(cc.getSumInfection())) {
					System.out.println("�ڷγ��� �����Ǿ���!!!!");
					System.out.println();
//					art.getCovid();
					art.getGameOver();
					break;
				} else {
					System.out.println("�������� �ʾҴ�");
					System.out.println();
				}

			}
			month++;
		}
	}

}
