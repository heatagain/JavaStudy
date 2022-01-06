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
		int dis = 0; // 거리두기 단계

		art.getStart2021();
		sm.timeDelay(1000);
		art.getKs();
		sm.timeDelay(500);

		// System.out.println("====Menu====");

		// km.memberMenu(); // 멤버 등록 관리 메뉴

		while (true && cc.life) {
			while (true) {
				System.out.println("=========지역 선택=========");
				System.out.println("1.강원도 2.지방 3.서울");
				System.out.print("입력 >> ");
				int menu = sc.nextInt();
				if (menu == 1) {
					System.out.println("강원도 선택 완료!");
					cc.setResistance(lev.getEasy()); // 이지모드 기본 저항력 셋팅
					lev.levelSelect(1);
					cc.setGangWonResistance();
					gangWonCheck = true;
					System.out.println();
					sm.timeDelay(300);
					System.out.println("청정 공기로 인해 저항력이 추가됐습니다");
					System.out.println("다른 지역보다 쉽습니다");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;
				} else if (menu == 2) {
					System.out.println("지방 선택 완료!");
					cc.setResistance(lev.getNormal());
					lev.levelSelect(2);
					cc.setProvinceResistance();
					provinceCheck = true;
					System.out.println();
					sm.timeDelay(300);
					System.out.println("적은 인구로 인해 저항력이 추가됐습니다");
					System.out.println("서울보다 쉽습니다");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;
				} else if (menu == 3) {
					System.out.println("서울 선택 완료!");
					cc.setResistance(lev.getHard());
					lev.levelSelect(3);
					System.out.println();
					cc.setSeoulResistance();
					seoulCheck = true;
					System.out.println();
					sm.timeDelay(300);
					System.out.println("높은 인구 밀집도로 인해 저항력 어드벤티지는 없습니다");
					System.out.println("살아남으십시오");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;
				} else {
					System.out.println("다시 입력하세요!");
					System.out.println();
					System.out.println();
				}
			}
			while (true) {
				System.out.println("===========캐릭터 선택==========");
				System.out.println("1.운동선수 2.간호사 3.학생");
				System.out.print("입력 >> ");
				int menu = sc.nextInt();

				if (menu == 1) {
					System.out.println("운동선수 선택 완료!");
					sm.timeDelay(300);
					hell.hell();
					hellCheck = true;
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;

				} else if (menu == 2) {
					System.out.println("간호사 선택 완료!");
					sm.timeDelay(300);
					ns.nurse();
					nurCheck = true;
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;

				} else if (menu == 3) {
					System.out.println("학생 선택 완료!");
					sm.timeDelay(300);
					stu.stu();
					stuCheck = true;
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
					break;

				} else {
					System.out.println("다시 입력하세요!");
					System.out.println();
					System.out.println();
					sm.timeDelay(300);
				}
			}
			break;
		}

		// 1년 12턴 진입
		while (month <= 12 && cc.life) {
			
			dis++;

			boolean inside = false;
			boolean outside = false;

			cc.setDefaultInfection(); // 감염력, 저항력 초기화
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

			if (month >= 6) { // 6월 이후로 오미크론 변이 등장 가차
				if (pc.probability(20)) {
					cc.setInfection(50);
					omi = true;
					System.out.println("=============================");
					System.out.println("      오미크론 변이 등장!!!!     ");
					System.out.println("=============================");
					System.out.println("   바이러스 감염력 50% 증가!!    ");
					sm.timeDelay(300);
					System.out.println("      체력 감소폭 증가!!");
					System.out.println();
					System.out.println();
					lev.getOmiHpDown1();
					lev.getOmiHpDown2();
					lev.getOmiHpDown3();
				}

			}
			if (month == 4 || month == 8) { // 대유행 체력 감소폭 증가
				System.out.println("=============================");
				System.out.println("         대유행 시작!!!!     ");
				System.out.println("=============================");
				sm.timeDelay(300);
				System.out.println("      체력 감소폭 증가!!");
				lev.getBigHpDown1();
				lev.getBigHpDown2();
				lev.getBigHpDown3();
			}

			if (gangWonCheck && nurCheck) {

			}

			while (provinceCheck || seoulCheck) { // 지방, 서울
				int inputMenu;

				if (nurCheck) { // 간호사 아침
					System.out.println("====== 아침 행동 선택 ======");
					System.out.println("1.10분 더자고 출근하기 2.씻고 출근하기 3.밥먹고 출근하기");
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
						System.out.println("다시 입력하세요");
					}

				}

				else if (hellCheck) { // 운동선수 아침
					System.out.println("====== 아침 행동 선택 ======");
					System.out.println("1.10분 더자고 출근하기 2.씻고 출근하기 3.아침운동하기");
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
						System.out.println("다시 입력하세요");
					}
				}

				else if (stuCheck) { // 학생 아침
					System.out.println("====== 아침 행동 선택 ======");
					System.out.println("1.등교하기 2.밥 먹고 등교하기 3.아 몰라 1교시 안가!");
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
						System.out.println("다시 입력하세요");
					}

				}

				///////////////////////// 점심

				if (nurCheck) { // 점심
					System.out.println("====== 점심 행동 선택 ======");
					System.out.println("1.구내식당가기 2.맛집 찾아가기 3.짬내서 운동하기");
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
						System.out.println("다시 입력하세요");
					}
				}

				else if (hellCheck) {
					System.out.println("====== 점심 행동 선택 ======");
					System.out.println("1.밥먹기 2.운동하기 3.재활치료");
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
						System.out.println("다시 입력하세요");
					}

				}

				else if (stuCheck) {
					System.out.println("====== 점심 행동 선택 ======");
					System.out.println("1.학식먹기 2.맛집탐방 3.놀러가기");
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
						System.out.println("다시 입력하세요");
					}

				}

				///////////////////////////// 저녁

				if (nurCheck) {
					System.out.println("====== 저녁 행동 선택 ======");
					System.out.println("1.칼퇴하고 푹쉬기 2.친구만나기 3.운동가기");
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
						System.out.println("다시 입력하세요");
					}

				}

				else if (hellCheck) {
					System.out.println("====== 저녁 행동 선택 ======");
					System.out.println("1.칼퇴하고 푹쉬기 2.친구만나기 3.운동가기");
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
						System.out.println("다시 입력하세요");
					}

				}

				else if (stuCheck) {
					System.out.println("====== 저녁 행동 선택 ======");
					System.out.println("1.술마시기 2.클럽가기 3.과제하기");
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
						System.out.println("다시 입력하세요");
					}
				}
			}

			while (gangWonCheck) { // 강원도 반복문
				
				System.out.println("============= " + dis + "월 ============");
				while (nurCheck) {
					// 아침
					System.out.println("====== 아침 행동 선택 ======");
					System.out.println("1.출근하기 2.밥먹고 출근하기 3.10분 더 자고 지각하기");
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
						System.out.println("다시 입력하세요");
					}
				}

				while (hellCheck) {
					// 아침
					System.out.println("====== 아침 행동 선택 ======");
					System.out.println("1.아침운동 2.마을 산책가기 3.밥먹고 출근하기");
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
						System.out.println("다시 입력하세요");
					}

				}

				while (stuCheck) {
					// 아침
					System.out.println("====== 아침 행동 선택 ======");
					System.out.println("1.늦잠자기 2.아침먹고 학교가기 3.농사 도와주기");
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
						System.out.println("다시 입력하세요");
					}

				}

				////////////////////////////// 점심
				while (nurCheck) {
					// 점심
					System.out.println("====== 점심 행동 선택 ======");
					System.out.println("1.밥먹기 2.낮잠자기 3.마을회관 가서 수다떨기");
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
						System.out.println("다시 입력하세요");
					}

				}
				while (hellCheck) {
					// 점심
					System.out.println("====== 점심 행동 선택 ======");
					System.out.println("1.점심운동 2.밥먹기 3.낮잠자기");
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
						System.out.println("다시 입력하세요");
					}

				}
				while (stuCheck) {
					// 점심
					System.out.println("====== 점심 행동 선택 ======");
					System.out.println("1.학식먹기 2.맛집 가기 3.과제하기");
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
						System.out.println("다시 입력하세요");
					}

				}

				////////////////////////// 강원도 저녁
				while (nurCheck) {
					// 저녁
					System.out.println("====== 저녁 행동 선택 ======");
					System.out.println("1.잠자기 2.술마시기 3.넷플릭스 보기");
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
						System.out.println("다시 입력하세요");
					}

				}
				while (hellCheck) {
					// 저녁
					System.out.println("====== 저녁 행동 선택 ======");
					System.out.println("1.저녁운동 2.집가서 자기 3.등산가기");
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
						System.out.println("다시 입력하세요");
					}

				}
				while (stuCheck) {
					// 저녁
					System.out.println("====== 저녁 행동 선택 ======");
					System.out.println("1.시내로 나가서 놀기 2.집가서 휴식 3.운동가기");
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
						System.out.println("다시 입력하세요");
					}

				}
				break;
			}

			sm.timeDelay(300);
			if (cc.life) {
				System.out.println();
				System.out.println("현재 코로나 저항력 : " + cc.getDefaultResistance() + "%");
				sm.timeDelay(300);
				System.out.println("현재 체력 : " + cc.getDefaultHp());
				sm.timeDelay(300);

				if (cc.getDefaultHp() >= 0) {

				} else {
					System.out.println("체력이 부족해서 죽었습니다..");
					sm.timeDelay(300);
					System.out.println("클리어 실패...");
					art.getGameOver();
					cc.life = false;
					break;
				}

//				if (cc.getDefaultHp() >= 150) {
//					System.out.println("체력이 150이 넘었습니다!!!!");
//					sm.timeDelay(300);
//					System.out.println("당신은 진정한 헬창");
//					sm.timeDelay(300);
//					System.out.println("코로나도 당신을 이길 수 없습니다!");
//					sm.timeDelay(300);
//					art.getGameClear();
//
//					break;
//				}

				System.out.println("코로나 검사중...");
				sm.timeDelay(1500);
				if (pc.probability(cc.getSumInfection())) {
					System.out.println("코로나에 감염되었다!!!!");
					System.out.println();
//					art.getCovid();
					art.getGameOver();
					break;
				} else {
					System.out.println("감염되지 않았다");
					System.out.println();
				}

			}
			month++;
		}
	}

}
