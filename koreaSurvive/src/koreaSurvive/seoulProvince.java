package koreaSurvive;

import java.util.Random;

public class seoulProvince {
	Random ran = new Random();

	
	//month 가 369는 사회적 거리두기 스크립트, 나머지는 일반 스크립트
	
	
	// 간호사 선택지
		// 아침
		// 1. 10분 더자고 출근하기 2. 씻고 출근하기 3. 밥먹고 출근하기
		// 점심
		// 1. 구내식당가기 2. 맛집 찾아가기 3. 짬내서 운동하기
		// 저녁
		// 1. 칼퇴하고 푹쉬기 2. 친구만나기 3. 운동가기
		
	public int NurseMoring1(int month) { // 리턴값을 줘서 그 리턴값에 맞게 체력이나 저항력 증가 및 감소

		int select = ran.nextInt(3);

		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {

			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자 
			} else if (select == 1) {
				System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자
			} else if (select == 1) {
				System.out.println("늦잠을 잤지만 사회적 거리두기로 재택근무를 하였다.");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
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
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 "); // 체력 감소
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 "); // 저항력 증가

			} else if (select == 2) {
				System.out.println("부지런히 씻고 무사히 출근!");
				System.out.printf("정시출근으로 체력 "); // 체력 증가
			}
			return select;

		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 ");
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 ");
			} else if (select == 2) {
				System.out.println("급하게 씻고 나오느라 마스크를 못 챙겼다");
				System.out.printf("마스크가 없어 저항력 "); // 저항력 감소
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
			System.out.println("밥을 급하게 먹어 체해버렸다!");
			System.out.print("속이 답답해서 체력 "); // 체력감소
		} else if (select == 1) {
			System.out.println("아침엔 고기지!");
			System.out.print("속이 든든해서 체력 "); // 체력 증가
			System.out.print("추가로 저항력 "); //저항력 증가
		} else if (select == 2) {
			System.out.println("밥을 든든히 먹은후엔 아이스 아메리카노지!");
			System.out.print("카페인 섭취로 인한 저항력 "); //저항력 증가
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("밥을 급하게 먹어 체해버렸다!");
			System.out.print("속이 답답해서 체력 ");
		} else if (select == 1) {
			System.out.println("아침엔 고기지!");
			System.out.print("속이 든든해서 체력 ");
			System.out.print("추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("출근길에 자주가는 카페가 코로나로 인해 망했다");
			System.out.print("카페인 섭취를 못해 저항력 "); //저항력 감소
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseLaunch1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("구내식당 공사로 인해 점심을 못 먹었다.");
			System.out.print("쫄쫄 굶어 체력 "); // 체력 감소
		} else if (select == 1) {
			System.out.println("18첩 반상이 나왔다!");
			System.out.print("배불리 먹어 체력 "); // 체력 증가
			System.out.print("기분이 좋아져 추가로 저항력 "); //저항력 증가
		} else if (select == 2) {
			System.out.println("과식으로 인해 응급실로 실려갔다.");
			System.out.print("응급실에 가서 저항력 "); //저항력 감소
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("구내식당 공사로 인해 점심을 못 먹었다.");
			System.out.print("쫄쫄 굶어 체력 ");
		} else if (select == 1) {
			System.out.println("코로나가 심해져 칸칸이 띄어 앉았다");
			System.out.println("혼자 먹기 외로워 저항력 ");// 저항력 감소
		} else if (select == 2) {
			System.out.println("과식으로 인해 응급실로 실려갔다.");
			System.out.print("응급실에 가서 저항력 ");
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseLaunch2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("맛집을 갔는데 웨이팅이 길어 밥을 못먹었다.");
			System.out.print("쫄쫄 굶어 체력 "); //체력 감소
		} else if (select == 1) {
			System.out.println("......겁나 맛있어");
			System.out.print("배불리 먹어 체력 "); //체력 증가
			System.out.print("하지만 저항력은 "); //저항력 감소
		} else if (select == 2) {
			System.out.println("맛집의 행운권에 당첨되어 한달 무료 이용권을 얻었다!");
			System.out.print("기분이 좋아져 저항력 "); //저항력 증가
		}
		return select;
	} else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("맛집을 갔는데 웨이팅이 길어 밥을 못먹었다.");
			System.out.print("쫄쫄 굶어 체력 ");
		} else if (select == 1) {
			System.out.println("......겁나 맛있어");
			System.out.print("배불리 먹어 체력 ");
			System.out.print("기분이 좋아져 추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("거리두기인데 맛집을 가??????");
			System.out.print("하?! "); //저항력 감소
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseLaunch3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("운동에 열중한 나머지 퇴근시간에 복귀했다!");
			System.out.print("상사에게 혼나 저항력 ");
		} else if (select == 1) {
			System.out.println("스쿼트 1000개!!!!!");
			System.out.print("근육이 너무 잘먹어 면역력 ");
			System.out.print("기분이 좋아져 추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("운동후엔 단백질쉐이크지!");
			System.out.printf("운동이 잘되서 면역력이 ");
		}
		return select;
	} else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("운동에 열중한 나머지 퇴근시간에 복귀했다!");
			System.out.print("상사에게 혼나 저항력 ");
		} else if (select == 1) {
			System.out.println("스쿼트 1000개!!!!!");
			System.out.print("근육이 너무 잘먹어 면역력 ");
			System.out.print("기분이 좋아져 추가로 저항력 ");
		} else if (select == 2) {
			System.out.println("다중이용시설 이용 자제!!!!");
			System.out.printf("자제해라... ");//저항력 감소
		}
		return select;

	}else {
		return select;
	}
	}

	public int NurseNight1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		
		if (select == 0) {
			System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
			System.out.print("만원버스를 피해 체력이 "); // 체력증가
		} else if (select == 1) {
			System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 야근을 하게 되었다");
			System.out.print("망할 상사때문에 체력 "); // 체력 감소
			System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
			System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
			System.out.print("만원버스를 피해 체력이 "); // 체력증가
		} else if (select == 1) {
			System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 야근을 하게 되었다");
			System.out.print("망할 상사때문에 체력 "); // 체력 감소
			System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
			System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseNight2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("사람 많은 곳을 피해 친구 집으로 가서 술을 먹었다!");
			System.out.printf("사람 많은 곳을 피해 저항력이 "); // 저항력 증가
		} else if (select == 1) {
			System.out.println("친구를 만나느라 샤샤샤~");
			System.out.print("기분이 좋아져서 체력 "); // 체력증가
		} else if (select == 2) {
			System.out.println("이시국에 꼭 만나야 했을까...");
			System.out.print("체력 "); // 체력 감소
			System.out.print("저항력 "); // 저항력 감소
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("사람 많은 곳을 피해 친구 집으로 가서 술을 먹었다!");
			System.out.printf("사람 많은 곳을 피해 저항력이 "); // 저항력 증가
		} else if (select == 1) {
			System.out.println("친구를 만나느라 샤샤샤~");
			System.out.println("...는 무슨!"); //딜레이 주기
			System.out.print("방역수칙!!!! "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("이시국에 꼭 만나야 했을까...");
			System.out.print("체력 "); // 체력 감소
			System.out.print("저항력 "); // 저항력 감소
		}
		return select;
	}else {
		return select;
	}
	}

	public int NurseNight3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
		
		if (select == 0) {
			System.out.println("운동을 갔는데 마스크를 깜빡했다!");
			System.out.print("마스크가 없어 저항력 "); // 저항력 감소
		} else if (select == 1) {
			System.out.println("3대 1000!!!");
			System.out.print("체력 "); // 체력 증가
			System.out.print("저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
			System.out.print("맛있게 먹었지만 체중이 증가해 체력 "); // 체력감소
		}
		return select;
	}else if (month == 3 || month == 6 || month == 9) {
		if (select == 0) {
			System.out.println("운동을 갔는데 마스크를 깜빡했다!");
			System.out.print("마스크가 없어 저항력 "); // 저항력 감소
		} else if (select == 1) {
			System.out.println("3대 1000!!!");
			System.out.print("체력 "); // 체력 증가
			System.out.print("저항력 "); // 저항력 감소
		} else if (select == 2) {
			System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
			System.out.print("방역 수칙좀 지켜라! "); // 저항력감소
		}
		return select;
	}else {
		return select;
	}
	}
	
	//운동선수 선택지
	//아침
	//// 1. 10분 더자고 출근하기 2. 씻고 출근하기 3. 아침운동하기 //간호사랑 동일
	//점심 
	//1. 밥먹기 2. 운동하기 3. 재활치료
	//저녁
	//1. 칼퇴하고 푹쉬기 2. 친구만나기 3. 운동가기 
	
	
	public int AthleteMoring1(int month) { // 리턴값을 줘서 그 리턴값에 맞게 체력이나 저항력 증가 및 감소
		
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자 
			} else if (select == 1) {
				System.out.println("늦잠을 자고 출근했지만 전산오류로 정시출근이 되었다!");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;
			
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("늦잠자다가 급하게 준비하느라 욕실에서 미끄러졌다!");
				System.out.print("욕실에서 미끄러져 체력 "); // 메인출력문에 넣자
			} else if (select == 1) {
				System.out.println("늦잠을 잤지만 사회적 거리두기로 재택근무를 하였다.");
				System.out.print("푹 자고 일어나서 체력 ");
				System.out.print("추가로 저항력 ");
			} else if (select == 2) {
				System.out.println("지각하여 오전내내 상사에게 시달렸지만 정신승리하였다!");
				System.out.print("정신승리로 인한 저항력 ");
			}
			return select;
		} else {
			return select;
		}
	}
	
	public int AthleteMoring2(int month) {
		
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 "); // 체력 감소
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 "); // 저항력 증가
				
			} else if (select == 2) {
				System.out.println("부지런히 씻고 무사히 출근!");
				System.out.printf("정시출근으로 체력 "); // 체력 증가
			}
			return select;
			
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("욕실에서 신나게 노래 부르며 준비하다가 지각 하였다!");
				System.out.print("상사에게 혼나 체력 ");
			} else if (select == 1) {
				System.out.println("뽀드드드드드드득 소리가 날정도록 깨끗하게 씻었다!");
				System.out.print("깨끗하게 씻어서 저항력 ");
			} else if (select == 2) {
				System.out.println("급하게 씻고 나오느라 마스크를 못 챙겼다");
				System.out.printf("마스크가 없어 저항력 "); // 저항력 감소
			}
			return select;
		} else {
			return select;
		}
	}
	
	public int AthleteMoring3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("밥대신 운동이지!");
				System.out.print("배가 고파서 체력 "); // 체력감소
			} else if (select == 1) {
				System.out.println("아침엔 운동이지!!");
				System.out.print("운동을 든든히 해서 체력 "); // 체력 증가
				System.out.print("추가로 저항력 "); //저항력 증가
			} else if (select == 2) {
				System.out.println("운동을 했으면 단백질 쉐이크지!");
				System.out.print("단백질 쉐이크 섭취로 인한 체력 "); //체력 증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("밥대신 운동이지!");
				System.out.print("배가 고파서 체력 "); // 체력감소
			} else if (select == 1) {
				System.out.println("아침엔 운동이지!!");
				System.out.print("운동을 든든히 해서 체력 "); // 체력 증가
				System.out.print("추가로 저항력 "); //저항력 증가
			} else if (select == 2) {
				System.out.println("운동을 했으면 단백질 쉐이크지!");
				System.out.print("단백질 쉐이크 섭취로 인한 저항력 "); //체력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteLaunch1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("단골가게 공사로 인해 점심을 못 먹었다.");
				System.out.print("쫄쫄 굶어 체력 "); // 체력 감소
			} else if (select == 1) {
				System.out.println("닭가슴살! 단백질!!!");
				System.out.print("배불리 먹어 체력 "); // 체력 증가
				System.out.print("기분이 좋아져 추가로 저항력 "); //저항력 증가
			} else if (select == 2) {
				System.out.println("닭가슴살을 너무 먹어 응급실로 실려갔다.");
				System.out.print("응급실에 가서 저항력 "); //저항력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("단골가게 공사로 인해 점심을 못 먹었다.");
				System.out.print("쫄쫄 굶어 체력 ");
			} else if (select == 1) {
				System.out.println("코로나가 심해져 칸칸이 띄어 앉았다");
				System.out.println("혼자 먹기 외로워 저항력 ");// 저항력 감소
			} else if (select == 2) {
				System.out.println("과식으로 인해 응급실로 실려갔다.");
				System.out.print("응급실에 가서 저항력 ");
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteLaunch2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("후하후하! 후하후하!");
				System.out.print("밥대신 운동이지! "); //체력 증가
			} else if (select == 1) {
				System.out.println("후하후하! 후하후하!");
				System.out.print("밥대신 운동이지! "); //체력 증가
			} else if (select == 2) {
				System.out.println("3대 1000 도저언!!!!");
				System.out.print("허리를 삐끗해 체력 "); //체력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("후하후하! 후하후하!");
				System.out.print("밥대신 운동이지! "); //체력 증가
			} else if (select == 1) {
				System.out.println("마스크를 깜빡하여 운동을 가다 경찰 단속에 걸렸다.");
				System.out.print("한번만 봐주세요....ㅠㅠ "); //저항력 감소
			} else if (select == 2) {
				System.out.println("3대 1000 도저언!!!!");
				System.out.print("허리를 삐끗해 체력 "); //체력 감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteLaunch3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("평소에 안좋았던 허리를 재활치료 받았다!");
				System.out.print("뻐근한게 해결되어 체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("스쿼트 1000개!!!!!... 하시면 안되다고요!!!");
				System.out.print("치료사에게 혼나 저항력 "); //저항력 감소
			} else if (select == 2) {
				System.out.println("운동후엔 단백질쉐이크지! ...운동 하지 말라고요!!!");
				System.out.printf("치료사에게 혼나 체력 "); // 체력 감소
			}
			return select;
		} else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("병원에 마스크를 안쓴 환자가 출연했다!");
				System.out.print("방역수칙좀.... "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("스쿼트 1000개!!!!!... 하시면 안되다고요!!!");
				System.out.print("치료사에게 혼나 저항력 "); //저항력 감소
			} else if (select == 2) {
				System.out.println("운동후엔 단백질쉐이크지! ...운동 하지 말라고요!!!");
				System.out.printf("치료사에게 혼나 체력 "); // 체력 감소
			}
			return select;
			
		}else {
			return select;
		}
	}
	
	public int AthleteNight1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			
			if (select == 0) {
				System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
				System.out.print("만원버스를 피해 체력이 "); // 체력증가
			} else if (select == 1) {
				System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 잔업을 하게 되었다");
				System.out.print("망할 상사때문에 체력 "); // 체력 감소
				System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
				System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("운좋게 카풀로 집까지 편하게 갔다!");
				System.out.print("만원버스를 피해 체력이 "); // 체력증가
			} else if (select == 1) {
				System.out.println("칼퇴를 하는 중에 상사에게 붙잡혀 잔업을 하게 되었다");
				System.out.print("망할 상사때문에 체력 "); // 체력 감소
				System.out.print("스트레스로 인한 저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("집에 가는길에 맛집 음식을 포장하였다.");
				System.out.printf("맛있는 음식으로 인해 체력 "); // 체력증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteNight2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("친구는 무슨! 운동이 내 친구다!!!");
				System.out.printf("운동을 해서 체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.print("기분이 좋아져서 체력 "); // 체력증가
			} else if (select == 2) {
				System.out.println("이시국에 꼭 만나야 했을까...");
				System.out.print("체력 "); // 체력 감소
				System.out.print("저항력 "); // 저항력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("친구는 무슨! 운동이 내 친구다!!!");
				System.out.printf("운동을 해서 체력 "); // 체력 증가
			} else if (select == 1) {
				System.out.println("친구를 만나느라 샤샤샤~");
				System.out.println("...는 무슨!"); //딜레이 주기
				System.out.print("방역수칙!!!! "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("이시국에 꼭 만나야 했을까...");
				System.out.print("체력 "); // 체력 감소
				System.out.print("저항력 "); // 저항력 감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int AthleteNight3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("운동을 갔는데 마스크를 깜빡했다!");
				System.out.print("마스크가 없어 저항력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("3대 1000!!!");
				System.out.print("체력 "); // 체력 증가
				System.out.print("저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
				System.out.print("맛있게 먹었지만 체중이 증가해 체력 "); // 체력감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("운동을 갔는데 마스크를 깜빡했다!");
				System.out.print("마스크가 없어 저항력 "); // 저항력 감소
			} else if (select == 1) {
				System.out.println("3대 1000!!!");
				System.out.print("체력 "); // 체력 증가
				System.out.print("저항력 "); // 저항력 감소
			} else if (select == 2) {
				System.out.println("헬스장 트레이너와 운동 끝나고 맥주를 마셨다!");
				System.out.print("방역 수칙좀 지켜라! "); // 저항력감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	//대학생 선택지
	//아침
	//1. 등교하기 2. 밥 먹고 등교하기 3. 아 몰라 1교시 안가!
	//점심
	//1. 학식먹기 2. 맛집탐방 3. 놀러가기
	//저녁
	//1. 술마시기 2. 클럽가기 3. 과제하기
	
	public int StudentMorning1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("아 피곤해 ㅠ 휴강안하나?");
				System.out.println("체력 "); //체력 감소
				System.out.println("기분이 안좋아 면역력 "); // 면역력 감소
			} else if (select == 1) {
				System.out.println("좋아하는 여자애랑 같이 듣는 수업이다");
				System.out.println("언능 가야지!");
				System.out.println("기분이 좋아 면역력 "); //면역력 증가
			} else if (select == 2) {
				System.out.println("등교하려던 찰나 휴강문자가 날라왔다");
				System.out.println("더 자야지~");
				System.out.println("휴식! 체력 "); //체력 증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("원격수업 개꿀^^");
				System.out.println("체력 "); //체력 증가
				System.out.println("기분이 좋아 면역력 "); // 면역력 증가
			} else if (select == 1) {
				System.out.println("교수님이 무조건 현장강의만 한다했다");
				System.out.println("자퇴하고 싶다..");
				System.out.println("기분이 안 좋아 면역력 ");//면역력 감소
			} else if (select == 2) {
				System.out.println("등교하려던 찰나 휴강문자가 날라왔다");
				System.out.println("더 자야지~");
				System.out.println("휴식! 체력 "); //체력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentMorning2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("전날 배달시킨 찜닭이 상한 것 같다");
				System.out.println("모르겠고 배고프니 일단 먹는다");
				System.out.println("배탈이 났다.. 면역력 ");//면역력 감소
			} else if (select == 1) {
				System.out.println("아침은 든든하게 먹어야지~");
				System.out.println("든든하게 먹었다 체력 ");//체력 증가
			} else if (select == 2) {
				System.out.println("아침을 먹으려고 한시간 일찍 일어났다");
				System.out.println("잠을 잘 못잤더니 피곤하다");
				System.out.println("체력 "); //체력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("전날 배달시킨 찜닭이 상한 것 같다");
				System.out.println("모르겠고 배고프니 일단 먹는다");
				System.out.println("배탈이 났다.. 면역력 ");//면역력 감소
			} else if (select == 1) {
				System.out.println("아침은 든든하게 먹어야지~");
				System.out.println("든든하게 먹었다 체력 ");//체력 증가
			} else if (select == 2) {
				System.out.println("역시 원격수업 들으면서 먹는 밥이 꿀맛이지~");
				System.out.println("든든하다 체력 "); //체력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentMorning3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("아 몰라~ 1교시 쿨하게 째고 더잤다");
				System.out.println("너무개운한걸?");
				System.out.println("체력 "); //체력 증가
				System.out.println("면역력 ");//면역력 증가
			} else if (select == 1) {
				System.out.println("교수님이 화가나서 f를 줬다");
				System.out.println("인생 망한 것 같다");
				System.out.println("기분이 안좋아.. 면역력 ");//면역력 감소
			} else if (select == 2) {
				System.out.println("푹자고 일어났는데 휴강이었다고 카톡이 왔다");
				System.out.println("마음이 편한해졌다");
				System.out.println("체력 "); //체력 증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("아 몰라~ 1교시 쿨하게 째고 더잤다");
				System.out.println("너무개운한걸?");
				System.out.println("체력 "); //체력 증가
				System.out.println("면역력 ");//면역력 증가
			} else if (select == 1) {
				System.out.println("교수님이 화가나서 f를 줬다");
				System.out.println("인생 망한 것 같다");
				System.out.println("기분이 안좋아.. 면역력 ");//면역력 감소
			} else if (select == 2) {
				System.out.println("원격수업 이지롱");
				System.out.println("줌 켜고 꿀잠 잤다");
				System.out.println("체력 "); // 체력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentLaunch1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("어제도 학식 오늘도 학식...");
				System.out.println("그만 먹고 싶다 질려..");
				System.out.println("기분이 안좋아 면역력 "); //면역력 감소
			} else if (select == 1) {
				System.out.println("학식에 치킨이 나왔다!");
				System.out.println("이맛에 학식 먹지~");
				System.out.println("남는시간에 쪽잠 체력 ");//체력 증가
			} else if (select == 2) {
				System.out.println("교내식당에서 확진자가 나왔다");
				System.out.println("혹시.. 나도?");
				System.out.println("면역력 ");// 면역력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("어제도 학식 오늘도 학식...");
				System.out.println("그만 먹고 싶다 질려..");
				System.out.println("기분이 안좋아 면역력 "); //면역력 감소
			} else if (select == 1) {
				System.out.println("학식에 치킨이 나왔다!");
				System.out.println("이맛에 학식 먹지~");
				System.out.println("남는시간에 쪽잠 체력 ");//체력 증가
			} else if (select == 2) {
				System.out.println("교내식당에서 확진자가 나왔다");
				System.out.println("혹시.. 나도?");
				System.out.println("면역력 ");// 면역력 감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentLaunch2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("인기절정 맛집을 찾아갔다");
				System.out.println("사람이 꽉찼다");
				System.out.println("감염 위험! 면역력 ");//면역력 감소
			} else if (select == 1) {
				System.out.println("파스타는 역시 이 맛이지~");
				System.out.println("맛있는걸 먹고 기분이 좋아졌다 면역력 ");//면역력 증가
			} else if (select == 2) {
				System.out.println("열심히 걸어서 맛집을 찾아갔는데 문을 닫았다!");
				System.out.println("지쳐 ㅠ 체력 ");//체력 감소
				System.out.println("걷기운동! 면역력 ");//면역력 증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("인기절정 맛집을 찾아갔다");
				System.out.println("사람이 꽉찼다");
				System.out.println("감염 위험! 면역력 ");//면역력 감소
			} else if (select == 1) {
				System.out.println("거리두기 인데 사람많은 맛집을 가?");
				System.out.println("감염 위험! 면역력 %d ");//면역력 감소
			} else if (select == 2) {
				System.out.println("열심히 걸어서 맛집을 찾아갔는데 문을 닫았다!");
				System.out.println("지쳐 ㅠ 체력 ");//체력 감소
				System.out.println("걷기운동! 면역력 ");//면역력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentLaunch3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("코인노래방가서 노래실력을 뽐냈다");
				// 절절한 옛날 발라드 브금
				System.out.println("이유는 모르지만 체력 ");//체력 증가
				System.out.println("감염 위험! 면역력 %d 감소");//면역력 감소
			} else if (select == 1) {
				System.out.println("pc방에서 친구들과 게임을 했다");
				System.out.println("역시 롤은 질병게임이다");
				System.out.println("체력 "); //체력 감소
				System.out.println("기분이 안좋아 면역력 "); //면역력 감소
			} else if (select == 2) {
				System.out.println("공원에서 좋아하는 여자애랑 산책했다");
				System.out.println("체력 "); //체력 상승
				System.out.println("면역력 "); //면역력 상승
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("코인노래방가서 노래실력을 뽐냈다");
				// 절절한 옛날 발라드 브금
				System.out.println("이유는 모르지만 체력 ");//체력 증가
				System.out.println("감염 위험! 면역력 %d 감소");//면역력 감소
			} else if (select == 1) {
				System.out.println("pc방에서 친구들과 게임을 했다");
				System.out.println("역시 롤은 질병게임이다");
				System.out.println("체력 "); //체력 감소
				System.out.println("기분이 안좋아 면역력 "); //면역력 감소
			} else if (select == 2) {
				System.out.println("원격수업인데 어딜 나가?");
				System.out.println("집에서 유튜브나 보자");
				System.out.println("면역력 "); //면역력 상승
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentNight1(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("술은 역시 소주지 마셔마셔~");
				System.out.println("그날 밤.. 기억이 없다");
				System.out.println("체력 "); //체력 감소
				System.out.println("소주로 소독했다! 면역력 "); //면역력 증가
			} else if (select == 1) {
				System.out.println("오늘은 간단히 맥주만 마실까?");
				System.out.println("친구랑 기분좋게 맥주한잔 했다");
				System.out.println("집가서 꿀잠 체력 "); //체력 증가
				System.out.println("감염 위험! 면역력 "); //면역력 감소
			} else if (select == 2) {
				System.out.println("술마시러 갔는데 가게가 문을 닫았다");
				System.out.println("그냥 집이나 가자..");
				System.out.println("체력, 면역력 변함이 없다.");
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("술은 역시 소주지 마셔마셔~");
				System.out.println("그날 밤.. 기억이 없다");
				System.out.println("체력 "); //체력 감소
				System.out.println("소주로 소독했다! 면역력 "); //면역력 증가
			} else if (select == 1) {
				System.out.println("거리두기 - 술집 영업제한 술마시다가 쫒겨났다?");
				System.out.println("아쉬워ㅠㅠ");
				System.out.println("기분이 안 좋아 면역력 "); //면역력 감소
			} else if (select == 2) {
				System.out.println("술마시러 갔는데 가게가 문을 닫았다");
				System.out.println("그냥 집이나 가자..");
				System.out.println("체력, 면역력 변함이 없다.");
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentNight2(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("둠칫~ 둠칫~ 신나게 놀았다");
				System.out.println("기분이좋아 체력 "); //체력 증가
				System.out.println("감염 위험! 면역력 ");//면역력 감소
			} else if (select == 1) {
				System.out.println("클럽갔는데 입구에서 막혔다...");
				System.out.println("혼자있고 싶어..");
				System.out.println("체력 "); //체력 감소
				System.out.println("기분이 안좋아.. 면역력 소");//면역력 감소
			} else if (select == 2) {
				System.out.println("클럽 가기 귀찮은걸?");
				System.out.println("집이나 가자~");
				System.out.println("집에서 쉬었다 면역력 "); //면역력 증가
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("거리두기인데 어딜 가?");
				System.out.println("곱게 집을 갔다");
				System.out.println("체력 면역력 변동 없다.");
			} else if (select == 1) {
				System.out.println("클럽갔는데 입구에서 막혔다...");
				System.out.println("혼자있고 싶어..");
				System.out.println("체력 "); //체력 감소
				System.out.println("기분이 안좋아.. 면역력 소");//면역력 감소
			} else if (select == 2) {
				System.out.println("거리두기라 클럽이 문을 안연다");
				System.out.println("집이나 가자~");
				System.out.println("집에서 쉬었다 면역력 "); //면역력 증가
			}
			return select;
		}else {
			return select;
		}
	}
	
	public int StudentNight3(int month) {
		int select = ran.nextInt(3);
		
		if (month == 1 || month == 2 || month == 4 || month == 5 || month == 7 || month == 8 || month == 11) {
			
			if (select == 0) {
				System.out.println("과제하느라 밤샜다..");
				System.out.println("체력 "); //체력 감소
			} else if (select == 1) {
				System.out.println("과제 해야지..zzZZ~");
				System.out.println("과제 하다가 잠 들었다 망했다.");
				System.out.println("체력 "); //체력 증가
				System.out.println("면역력 ");//면역력 증가
			} else if (select == 2) {
				System.out.println("좋아하는 여자애가 과제 대신 해달라고 했다");
				System.out.println("과제 2개 하느라 밤샜다");
				System.out.print("헤헤.. 그래도 행복해...");
				System.out.println("체력  ");//체력 감소
			}
			return select;
		}else if (month == 3 || month == 6 || month == 9) {
			if (select == 0) {
				System.out.println("과제하느라 밤샜다..");
				System.out.println("체력 "); //체력 감소
			} else if (select == 1) {
				System.out.println("과제 해야지..zzZZ~");
				System.out.println("과제 하다가 잠 들었다 망했다.");
				System.out.println("체력 "); //체력 증가
				System.out.println("면역력 ");//면역력 증가
			} else if (select == 2) {
				System.out.println("좋아하는 여자애가 과제 대신 해달라고 했다");
				System.out.println("과제 2개 하느라 밤샜다");
				System.out.print("헤헤.. 그래도 행복해...");
				System.out.println("체력  ");//체력 감소
			}
			return select;
		}else {
			return select;
		}
	}
	
	
	
	
	
	
	
	
}


	
