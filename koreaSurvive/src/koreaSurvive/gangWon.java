package koreaSurvive;

import java.util.Random;

public class gangWon {
	//month 가 369는 사회적 거리두기 스크립트, 나머지는 일반 스크립트
	Random ran = new Random();
	level lev = new level();
	subMethod sm = new subMethod();
	

	// 간호사 선택지
	// 아침
	// 1. 출근하기 2.밥먹고 출근하기 3. 10분 더 자고 지각하기
	// 점심
	// 1. 밥먹기 2. 낮잠자기 3. 마을회관 가서 수다떨기
	// 저녁
	// 1. 잠자기 2. 술마시기 3. 넷플릭스 보기

	public int NurseMoring1(int month) { // 리턴값을 줘서 그 리턴값에 맞게 체력이나 저항력 증가 및 감소

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("피곤해 ㅠㅠ 출근하기 싫어");
				System.out.println("체력 " + lev.getHpDown1()); // 메인출력문에 넣자 //체력감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("출근하는 길에 귀여운 고양이를 봤다");
				System.out.println("기분이 좋아져서 면역력 " + lev.getResistanceUp1()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("출근하려는데 원장님을 만났다");
				System.out.print("원장님이 차를 타고 가 체력 +" + lev.getHpUp1()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("기껏 출근했는데 마스크를 안가지고 왔다!");
				System.out.println("다시 집에 가서 마스크를 가져왔다...");
				System.out.println("체력 " + lev.getHpDown1()); // 체력감소
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("출근하는 길에 귀여운 고양이를 봤다");
				System.out.println("기분이 좋아져서 면역력 +" + lev.getResistanceUp1()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("출근하려는데 원장님을 만났다");
				System.out.print("원장님이 차를 타고 가 체력 +" + lev.getHpUp1()); // 체력 증가
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
				System.out.println("밥을 너무 급하게 먹다가 체했다!");
				System.out.println("체력 -" + lev.getHpDown1()); // 체력 감소
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("강원도 감자로 해먹는 감자짜글이");
				System.out.println("완전 밥도둑이잖아?");
				System.out.println("기분이 좋아져서 면역력 +" + lev.getResistanceUp1()); // 면역력 증가
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("상한 밥을 먹어서 배가 꾸르륵 거린다 ㅠ");
				System.out.println("면역력 " + lev.getResistanceDown1()); // 면역력 감소
				sm.timeDelay(300);
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("거리두기 때문에 밥집이 문을 닫았다...");
				System.out.println("배고파!!!");
				System.out.println("체력 -" + lev.getHpDown1());// 체력 감소
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("강원도 감자로 해먹는 감자짜글이");
				System.out.println("완전 밥도둑이잖아?");
				System.out.println("기분이 좋아져서 면역력 +" + lev.getResistanceUp1()); // 면역력 증가
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("상한 밥을 먹어서 배가 꾸르륵 거린다 ㅠ");
				System.out.println("면역력 " + lev.getResistanceDown1()); // 면역력 감소
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
				System.out.println("지각을 했는데 아무도 눈치채지 못했다!");
				System.out.println("10분 더자서 피로가 풀렸다");
				System.out.println("면역력 +" + lev.getResistanceUp1()); // 면역력 증가
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("지각해서 원장님한테 된통 깨졌다ㅜㅜ");
				System.out.println("잔소리 30분 들어서 기분이 안좋아졌다...");
				System.out.println("면역력 " + lev.getResistanceDown1()); // 면역력 감소
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("10분 더 잔다는게 2시간 더 자버렸다");
				System.out.println("부재중 15통...");
				System.out.println("온 몸에 식은땀이 흐른다...");
				System.out.println("피로가 싹풀려서 체력 +" + lev.getHpUp1()); // 체력 증가
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("아침에 영양제를 먹었다!");
				System.out.print("면역력 +" + lev.getResistanceUp1());	// 면역력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("출근길에 자주가는 카페가 코로나로 인해 망했다");
				System.out.print("카페인 섭취를 못해 저항력 " + lev.getResistanceDown1()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("아침엔 고기지!");
				System.out.print("속이 든든해서 체력 +" + lev.getHpUp1());
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
				System.out.println("두메산골 최고의 맛집에서 밥 먹었다");
				System.out.println("체력이 +" + lev.getHpUp2()); // 체력증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("밥 먹으러 갔는데 밥집이 없어서 30분 걸어갔다");
				System.out.println("힘들어 ㅠㅠ");
				System.out.println("체력이 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("마을회관에 잔치가 있어서 거기서 점심을 먹었다");
				System.out.println("마을 어르신들이 막걸리르ㄹ 너무 많이 주셔ㅅ서ㄴ취해띠..");
				System.out.println("면역력 " + lev.getResistanceDown3());// 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("두메산골 최고의 맛집에서 밥 먹었다");
				System.out.println("체력이 +" + lev.getHpUp2()); // 체력증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("거리두기 때문에 밥집이 다 문을 닫아 헛 걸음만 했다");
				System.out.println("힘들어 ㅠㅠ");
				System.out.println("체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("마을회관에 잔치가 있어서 거기서 점심을 먹었다");
				System.out.println("마을 어르신들이 막걸리르ㄹ 너무 많이 주셔ㅅ서ㄴ취해띠..");
				System.out.println("면역력 " + lev.getResistanceDown3());// 면역력 감소
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
				System.out.println("너무피곤해~ 밥은 스킵한다!!");
				System.out.println("zzZZ~ 음 개운하다!");
				System.out.println("저항력 +" + lev.getResistanceUp2()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("낮잠 자서 개운하긴한데 너무 배고파서 힘이 없다...");
				System.out.println("체력 " + lev.getHpDown3()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("낮잠자려는데 원장님이 깨워서 심부름을 시켰다");
				System.out.println(" ^_^ 하늘같은 원장님 말은 들어야지");
				System.out.println("피곤해 체력 " + lev.getHpDown2());// 체력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("너무피곤해~ 밥은 스킵한다!!");
				System.out.println("zzZZ~ 음 개운하다!");
				System.out.println("저항력 +" + lev.getResistanceUp2()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("낮잠 자서 개운하긴한데 너무 배고파서 힘이 없다...");
				System.out.println("체력 " + lev.getHpDown3()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("낮잠자려는데 원장님이 깨워서 심부름을 시켰다");
				System.out.println(" ^_^ 하늘같은 원장님 말은 들어야지");
				System.out.println("피곤해 체력 " + lev.getHpDown2());// 체력 감소
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
				System.out.println("마을 어르신들한테 이쁨받는다");
				System.out.println("용돈도 쥐어주신다");
				System.out.println("기분 최고조 면역력 +" + lev.getResistanceUp3()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("마을 어르신들한테 결혼은 언제해? 라떼는 말야 콤보를 맞았다");
				System.out.println("마을회관에서 도망쳤다!");
				System.out.println("기분이 안좋아 면역력 " + lev.getResistanceDown2());// 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("마을회관 가는길에 옆집 아주머니한테 붙잡혔다");
				System.out.println("아주머니한테 1시간 동안 잔소리를 들었다");
				System.out.println("피곤해 체력 " + lev.getHpDown3()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("마을 어르신들한테 이쁨받는다");
				System.out.println("용돈도 쥐어주신다");
				System.out.println("기분 최고조 면역력 +" + lev.getResistanceUp3()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("마을 어르신들한테 결혼은 언제해? 라떼는 말야 콤보를 맞았다");
				System.out.println("마을회관에서 도망쳤다!");
				System.out.println("기분이 안좋아 면역력 " + lev.getResistanceDown2());// 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("마을회관 사람들이 마스크를 안끼고 대화를 한다");
				System.out.println("거리두기 위반이라고 어르신한테 깝치다가 등짝을 맞았다");
				System.out.println("체력 " + lev.getHpDown3()); // 체력 감소
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
				System.out.println("푹 잤다");
				System.out.println("아이 개운혀유우~");
				System.out.println("체력 "); // 체력증가
				System.out.println("면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("잠 자다가 가위에 눌렸다!");
				System.out.println("귀신 무서웡!");
				System.out.println("피곤하다 체력 ");// 감소
				System.out.println("저항력 ");// 감소
			} else if (select == 2) {
				System.out.println("보일러가 고장났나 방이 너무 춥다");
				System.out.println("오들오들 떨면서 잤다 감기 걸렸나..?");
				System.out.println("면역력 "); // 면역력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("푹 잤다");
				System.out.println("아이 개운혀유우~");
				System.out.println("체력 "); // 체력증가
				System.out.println("면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("잠 자다가 가위에 눌렸다!");
				System.out.println("귀신 무서웡!");
				System.out.println("피곤하다 체력 ");// 감소
				System.out.println("저항력 ");// 감소
			} else if (select == 2) {
				System.out.println("보일러가 고장났나 방이 너무 춥다");
				System.out.println("오들오들 떨면서 잤다 감기 걸렸나..?");
				System.out.println("면역력 "); // 면역력 감소
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
				System.out.println("역시 알코올은 영원한 친구");
				System.out.println("소주로 몸과 마음을 소독했다");
				System.out.println("면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.print("기분이 좋아져서 체력 "); // 체력증가
			} else if (select == 2) {
				System.out.println("이시국에 꼭 만나야 했을까...");
				System.out.print("체력 "); // 체력 감소
				System.out.print("저항력 "); // 저항력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("역시 알코올은 영원한 친구");
				System.out.println("소주로 몸과 마음을 소독했다");
				System.out.println("면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.print("기분이 좋아져서 체력 "); // 체력증가
			} else if (select == 2) {
				System.out.println("이시국에 꼭 만나야 했을까...");
				System.out.print("체력 "); // 체력 감소
				System.out.print("저항력 "); // 저항력 감소
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
				System.out.println("역시 집에서 넷플릭스 보는게 최고지~");
				System.out.println("체력 "); // 체력 증가
				System.out.println("방역수칙도 지켜 면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("아니 시간이 벌써..?");
				System.out.println("넷플릭스 보다가 늦잠이다!");
				System.out.println("피곤해 ㅠㅠ 체력 "); // 체력 감소
			} else if (select == 2) {
				System.out.println("넷플릭스 보다가 집청소를 하나도 안했다");
				System.out.println("집안에 파리가 꼬인다");
				System.out.println("면역력 "); // 면역력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("역시 집에서 넷플릭스 보는게 최고지~");
				System.out.println("체력 "); // 체력 증가
				System.out.println("방역수칙도 지켜 면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("아니 시간이 벌써..?");
				System.out.println("넷플릭스 보다가 늦잠이다!");
				System.out.println("피곤해 ㅠㅠ 체력 "); // 체력 감소
			} else if (select == 2) {
				System.out.println("넷플릭스 보다가 집청소를 하나도 안했다");
				System.out.println("집안에 파리가 꼬인다");
				System.out.println("면역력 "); // 면역력 감소
			}
			return select;
		} else {
			return select;
		}
	}
	
	//운동선수 시골
	//아침
	// 1. 아침운동 2. 마을 산책가기 3. 밥먹고 출근하기
	//점심
	// 1. 점심운동 2. 밥먹기 3. 낮잠자기
	//저녁
	// 1. 저녁운동 2. 집가서 자기 3. 등산가기

	public int AthleteMorning1(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
																												// 달

			if (select == 0) {
				System.out.println("운동은 공복운동이지!");
				System.out.println("운동으로 인한 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("빈속에 무리를 했나...");
				System.out.println("속이 아파서 면역력 " + lev.getResistanceDown1());
				System.out.println();
				sm.timeDelay(300);// 저항력 감소
			} else if (select == 2) {
				System.out.println("운동에 너무 심취해서 점심시간 전에 출근했다...");
				System.out.println("주위의 따가운 눈초리에 면역력 " + lev.getResistanceDown2()); // 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("운동은 공복운동이지!");
				System.out.println("운동으로 인한 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("빈속에 무리를 했나...");
				System.out.println("속이 아파서 면역력 " + lev.getResistanceDown1()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("이시국엔 운동이 답이다!!!");
				System.out.println("우어어어어!!!"); // 면역력 감소
				System.out.println("무리해서 면역력 " + lev.getResistanceDown2());
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
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("산책을 가다가 다리를 삐끗!");
				System.out.println("당분간 운동을 못해서 체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("시골의 정기를 받았다!!!");
				System.out.println("시골의 정기를 받아 면역력 +" + lev.getResistanceUp2()); // 면역력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("산책을 가다가 뱀을 마주쳤다!");
				System.out.println("겉은 근육이여도 속은 여린 나... 면역력 " + lev.getResistanceDown1()); // 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("산책을 가다가 다리를 삐끗!");
				System.out.println("당분간 운동을 못해서 체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("산책나온 마을 주민들이 코로나에 둔감하여 마스크를 안한다!!");
				System.out.println("재빠르게 도망갔다 면역력 +" + lev.getResistanceUp2()); // 면역력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("산책을 가다가 뱀을 마주쳤다!");
				System.out.println("겉은 근육이여도 속은 여린 나... 면연력 " + lev.getResistanceDown1()); // 면역력 감소
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
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("아침엔 닭가슴살이지!");
				System.out.println("체력 +"  + lev.getHpUp1()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("아침엔 소고기지!");
				System.out.println("체력 +" + lev.getHpUp3()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("한국인은 밤심!");
				System.out.println("든든해서 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("아침엔 닭가슴살이지!");
				System.out.println("체력 +"  + lev.getHpUp1()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("이시국엔 더 잘먹어야지!");
				System.out.println("체력 +" + lev.getHpUp3()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("한국인은 밤심!");
				System.out.println("든든해서 체력 +" + lev.getHpUp2()); // 체력 증가
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
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("운동에 떄가 어딨어!!");
				System.out.println("운동을 해서 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("운동을 가려고 했지만 상사와 식당을 가게 되었다.");
				System.out.println("눈치없는 상사 때문에 저항력 " + lev.getResistanceDown2()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("사람이 없는 곳에서 열심히 운동했다!");
				System.out.println("면역력 +" + lev.getResistanceUp3()); // 면역력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("운동에 떄가 어딨어!!");
				System.out.println("운동을 해서 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("운동을 가려고 했지만 상사와 식당을 가게 되었다.");
				System.out.println("눈치없는 상사 때문에 저항력 " + lev.getResistanceDown2()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("운동을 하고 싶었지만 마스크를 두고와서 집에 돌아왔다");
				System.out.println("면역력 +" + lev.getResistanceUp3()); // 면역력 증가
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
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("밥보다 운동이지!!");
				System.out.println("밥을 안먹어서 체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("점심엔 단백질!");
				System.out.println("단백질을 먹어 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("상사가 닭가슴살을 뺏어먹었다");
				System.out.println("......ㅡㅡ " + lev.getResistanceUp3()); // 면역력 감소 
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("밥보다 운동이지!!");
				System.out.println("밥을 안먹어서 체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("점심엔 단백질!");
				System.out.println("단백질을 먹어 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("상사가 닭가슴살을 뺏어먹었다");
				System.out.println("......ㅡㅡ " + lev.getResistanceUp3()); // 면역력 감소
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
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("잠보단 운동이지!!");
				System.out.println("운동을 해서 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("30분만 자려던게 4시까지 자버렸다! ");
				System.out.println("주위의 눈초리를 받아 면역력 " + lev.getResistanceDown3()); // 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("꿈에서 운동을 하였다!");
				System.out.println("기분이 좋아서 면역력 +" + lev.getResistanceUp3()); // 면역력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("잠보단 운동이지!!");
				System.out.println("운동을 해서 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("30분만 자려던게 4시까지 자버렸다! ");
				System.out.println("주위의 눈초리를 받아 면역력 " + lev.getResistanceDown3()); // 면역력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("꿈에서 운동을 하였다!");
				System.out.println("기분이 좋아서 면역력 +" + lev.getResistanceUp3()); // 면역력 증가
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
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("자기전에 운동하는게 최고!!");
				System.out.println("의학적으로 자기전에는 운동이 안좋아서 면역력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("시골은 산스짐이 최고지!!");
				System.out.println("운동으로 체력"); // 체력 증가
			} else if (select == 2) {
				System.out.println("3대 1000 도전!!!!");
				System.out.println("실패...."); // 면역력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("자기전에 운동하는게 최고!!");
				System.out.println("의학적으로 자기전에는 운동이 안좋아서 면역력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("시골은 산스짐이 최고지!!");
				System.out.println("운동으로 체력"); // 체력 증가
			} else if (select == 2) {
				System.out.println("3대 1000 도전!!!!");
				System.out.println("실패...."); // 면역력 감소
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteNight2(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("집까지 뛰어갔다!");
				System.out.println("체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("집을 가다가 야생의 고라니를 만났다!");
				System.out.println("놀라서 면역력 "); // 면역력 감소
			} else if (select == 2) {
				System.out.println("간만에 집에가서 푹 쉬었다.");
				System.out.println("집이 최고야!"); // 면역력 증가
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("사회적 거리두기로 일찍 집에 들어갔다.");
				System.out.println("체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("집을 가다가 야생의 고라니를 만났다!");
				System.out.println("놀라서 면역력 "); // 면역력 감소
			} else if (select == 2) {
				System.out.println("간만에 집에가서 푹 쉬었다.");
				System.out.println("집이 최고야!"); // 면역력 증가
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	public int AthleteNight3(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
			// 달
			
			if (select == 0) {
				System.out.println("등산도 운동이지!");
				System.out.println("산의 정기를 받아 면역력 "); // 저항력 증가
			} else if (select == 1) {
				System.out.println("산을 오르다가 반달곰을 만났다.");
				System.out.println("뒤도 안보고 뛰느라 체력"); // 체력 감소
			} else if (select == 2) {
				System.out.println("등산객들이 마스크를 안쓰고 다닌다 ㅡㅡ.");
				System.out.println("민폐 등산객들 때문에 면역력 "); // 면역력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("산에 도착했는데 마스크를 잃어버려 경찰단속에 걸렸다.");
				System.out.println("마스크를 잃어버려 면역력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("산을 오르다가 반달곰을 만났다.");
				System.out.println("뒤도 안보고 뛰느라 체력"); // 체력 감소
			} else if (select == 2) {
				System.out.println("등산객들이 마스크를 안쓰고 다닌다 ㅡㅡ.");
				System.out.println("민폐 등산객들 때문에 면역력 "); // 면역력 감소
			}
			return select;
		} else {
			return select;
		}
		
	}
	
	//시골 대학생
	// 오전 선택지
	// 1. 늦잠자기 2.아침먹고 학교가기 3. 농사 도와주기.

	// 점심 선택지
	// 1. 학식먹기 2. 맛집 가기. 3. 과제하기

	// 저녁 선택지
	// 1. 시내로 나가서 놀기. 2. 집가서 휴식 3. 운동가기
	
	public int StudentMorning1(int month) {
		int select = ran.nextInt(3);
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) { // 이벤트 없는
																												// 달

			if (select == 0) {
				System.out.println("푹자고 일어났지만 교수님이 공강을 때렸다!");
				System.out.println("늦잠을 자서 저항력이 +" + lev.getResistanceUp2()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("늦잠을 자버려서 한대뿐인 버스를 놓쳤다!");
				System.out.println("학교까지 뛰어가서 체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("늦잠자다가 급하게 준비하다가 문턱에 발가락을 찧었다!");
				System.out.println("겁나 아파... 체력 " + lev.getHpDown3()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) { // 사회적 거리두기
			if (select == 0) {
				System.out.println("푹자고 일어났지만 교수님이 공강을 때렸다!");
				System.out.println("늦잠을 자서 저항력이 +" + lev.getResistanceUp2()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("늦잠을 잤지만 원격수업이었다!");
				System.out.println("원격수업 최고! 하지만 집에만 있어서 체력 " + lev.getHpDown2()); // 체력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("늦잠자다가 급하게 준비하다가 문턱에 발가락을 찧었다!");
				System.out.println("겁나 아파... 체력 " + lev.getHpDown3()); // 체력 감소
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
				System.out.println("한국인은 밥심이지!!!");
				System.out.println("밥이 최고! 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("학교에 도착했는데 마스크를 잃어버렸다!");
				System.out.println("마스크가 없어 저항력이 " + lev.getResistanceDown2()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("학교가는길에 방구차를 만나 소독이 되었다!");
				System.out.println("뿌아아아아앙!!! 저항력 +" + lev.getResistanceUp2()); // 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		}

		else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("한국인은 밥심이지!!!");
				System.out.println("밥이 최고! 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("학교에 도착했는데 마스크를 잃어버렸다!");
				System.out.println("마스크가 없어 저항력이 " + lev.getResistanceDown2()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("마스크를 깜빡하여 경찰 단속에 걸렸다");
				System.out.println("경찰보고 놀라 저항력이 " + lev.getResistanceUp2()); // 저항력 감소
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
				System.out.println("부모님을 도와 새벽부터 농사일을 했다.");
				System.out.println("효심이 가득해 체력과 저항력 +" + lev.getResistanceUp1()); // 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("농사를 도와주다가 야생의 고라니를 만났다!");
				System.out.println("고라니를 보고 심신이 약해서 저항력 " + lev.getResistanceDown2()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("농사를 도와주다가 학교에 지각했다!");
				System.out.println("학교까지 뛰어가서 체력 " + lev.getHpDown2());// 체력 감소
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("부모님을 도와 새벽부터 농사일을 했다.");
				System.out.println("효심이 가득해 체력과 저항력 +" + lev.getResistanceUp1()); // 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("농사를 도와주다가 야생의 고라니를 만났다!");
				System.out.println("고라니를 보고 심신이 약해서 저항력 " + lev.getResistanceDown2()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("일하다가 잠깐 마스크를 벗었는데 단속에 걸렸다!");
				System.out.println("잠깐 내렸지만 3단봉으로 맞아서 체력 " + lev.getHpDown2());// 체력 감소
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
				System.out.println("김치...나물...김치...");
				System.out.println("식이섬유가 풍부하여 저항력 +" + lev.getResistanceUp2());// 저항력 중가.
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("맞은편 자리에 교수님이 앉으셨다!");
				System.out.println("체했..... 저항력 " + lev.getResistanceDown3()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("학식에 한우가!!!");
				System.out.println("고기이이이이!!!! 체력 +" + lev.getHpUp2()); // 체력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("김치...나물...김치...");
				System.out.println("식이섬유가 풍부하여 저항력 +" + lev.getResistanceUp2());// 저항력 중가.
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("맞은편 자리에 교수님이 앉으셨다!");
				System.out.println("체했..... 저항력 " + lev.getResistanceDown3()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("친구랑 나란히 앉아서 밥을 먹었다");
				System.out.println("한칸씩 띄어 앉기 필수!! 체력 +" + lev.getHpUp2()); // 체력 증가
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
				System.out.println("강원도는 감자드래요!");
				System.out.println("감자!!! 체력 +" + lev.getHpUp1() + "저항력 +" + lev.getResistanceUp1()); // 체력, 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("학교로 돌아가는 유일한 버스를 놓쳤다!");
				System.out.println("학교까지 어떻게 가지... 저항력" + lev.getResistanceDown3()); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("맛집에 사람이 별로 없어서 편하게 밥을 먹었다.");
				System.out.println("사람이 별로 없어서 저항력 ");// 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("강원도는 감자드래요!");
				System.out.println("감자!!! "); // 체력, 저항력 증가
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 1) {
				System.out.println("거리두기 안지키니?");
				System.out.println("지켜야지? "); // 저항력 감소
				System.out.println();
				sm.timeDelay(300);
			} else if (select == 2) {
				System.out.println("거리두기 안지키니?");
				System.out.println("지켜야지? ");// 저항력 증가
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
				System.out.println("한국인은 밥심이거늘....");
				System.out.println("과제하느라 밥을 못먹어 체력 ");// 체력 감소
			} else if (select == 1) {
				System.out.println("지나가던 교수님이 기특하다고 미리 A+ 를 주셨다");
				System.out.println("기분이 좋아 저항력이 "); // 저항력 증가
			} else if (select == 2) {
				System.out.println("과제를 하는 중에 과제가 추가되었다.");
				System.out.println("교수님......"); // 체력 저항력 감소
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("사회적 거리두기로 마스크가 필수!");
				System.out.println("..이지만 마스크를 두고와서 카페에서 쫒겨났다.");
				System.out.println("쫒겨나 마음에 상처를 받아 ");// 체력 감소
			} else if (select == 1) {
				System.out.println("지나가던 교수님이 기특하다고 미리 A+ 를 주셨다");
				System.out.println("기분이 좋아 저항력이 "); // 저항력 증가
			} else if (select == 2) {
				System.out.println("과제를 하는 중에 과제가 추가되었다.");
				System.out.println("교수님......"); // 체력 저항력 감소
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
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.println("기분이 좋지만 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("사람이 없네...? 아.. 여기 시골이지..");
				System.out.println("시골은 시내도 마찬가지!"); // 저항력 증가
			} else if (select == 2) {
				System.out.println("코로나가 걱정되어 가는길에 돌아왔다");
				System.out.println("시골이어도 조심! "); // 저항력 증가
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.println("기분이 좋지만 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("사람이 없네...? 아.. 여기 시골이지..");
				System.out.println("시골은 시내도 마찬가지!"); // 저항력 증가
			} else if (select == 2) {
				System.out.println("방역수칙 지킴");
				System.out.println("시골이여도 조심 "); // 저항력 증가
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
				System.out.println("한대뿐인 버스를 무사히 타고 집에 왔다!");
				System.out.println("집이 최고! "); // 체력 증가
			} else if (select == 1) {
				System.out.println("한대뿐인 버스를 놓쳤다!");
				System.out.println("집까지 걸어다가가 몸살이 걸려 ");// 저항력 감소
			} else if (select == 2) {
				System.out.println("집까지 걸어다가 야생의 고라니를 만났다!");
				System.out.println("야생의 고라니는 싸움을 걸어왔다!!");
				System.out.println("고라니에게 패패하여 체력 ");// 체력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("한대뿐인 버스를 무사히 타고 집에 왔다!");
				System.out.println("집이 최고! "); // 체력 증가
			} else if (select == 1) {
				System.out.println("한대뿐인 버스를 놓쳤다!");
				System.out.println("집까지 걸어다가가 몸살이 걸려 ");// 저항력 감소
			} else if (select == 2) {
				System.out.println("집까지 걸어다가 야생의 고라니를 만났다!");
				System.out.println("야생의 고라니는 싸움을 걸어왔다!!");
				System.out.println("고라니에게 패패하여 체력 ");// 체력 감소
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
				System.out.println("산스장이 최고!");
				System.out.println("산속의 정기를 받아 "); // 저항력 증가
			} else if (select == 1) {
				System.out.println("운동을 가다 친구를 만나 술을 마시러 갔다.");
				System.out.println("다이어트는 내일부터지~ ");// 체력, 저항력 감소
			} else if (select == 2) {
				System.out.println("운동을 가려 했지만 밭일이 많아 못갔다");
				System.out.println("정신적인 스트레스로 ");// 저항력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("산스장이 최고!");
				System.out.println("산속의 정기를 받아 "); // 저항력 증가
			} else if (select == 1) {
				System.out.println("운동을 가다 친구를 만나 술을 마시러 갔다.");
				System.out.println("방역수칙 안지키니??????? 쫌?!");
				System.out.println("지키라고 뫄!");// 체력, 저항력 감소
			} else if (select == 2) {
				System.out.println("운동을 가려 했지만 밭일이 많아 못갔다");
				System.out.println("정신적인 스트레스로 ");// 저항력 감소
			}
			return select;
		} else {
			return select;
		}
	}
}

