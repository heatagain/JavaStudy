import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		
		// ArrayList
		// ArrayList 선언 방법
		// ArrayList<타입> 이름 = new ArrayList<타입>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// 값 추가! 이름.add("들어갈 값");
		arrayList.add("승환");
		arrayList.add("병관");
		arrayList.add("수민");
		
		// 원하는 위치에 값 추가! -> 삽입
		arrayList.add(1, "태경");
		
		// 값 삭제! -> .remove(인덱스);
		arrayList.remove(arrayList.size()-1);
		arrayList.remove(1);
		arrayList.remove(1);
		
		// arrayList 출력
		// arrayList의 크기 -> size()
		for(int i = 0; i < arrayList.size(); i++) {
			// 값 가져오기 -> 이름.get(index)
			System.out.println(arrayList.get(i));
		}
		

	}

}
