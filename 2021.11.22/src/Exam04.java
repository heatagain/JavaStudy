
public class Exam04 {

	public static void main(String[] args) {
		
		int i;
		int j;
		int result;
		
		for (i = 2; i <= 9; i++) {
			System.out.println("==" + i + "´Ü==");
			for(j = 1; j <= 9; j++) {
				
				result = i * j;
				System.out.println(i + "*" + j + " = " + result);
			}
			
		}

	}

}
