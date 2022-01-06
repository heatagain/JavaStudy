
public class Exam06 {

	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = array1;
		
		array1[3] = 999;
		
		System.out.println(array2[3]);

	}

}
