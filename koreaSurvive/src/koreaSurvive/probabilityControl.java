package koreaSurvive;

import java.util.Random;

public class probabilityControl {
	
	public boolean probability(int x1) {
		Random random = new Random();

		int d = random.nextInt(100) + 1;
		if (d <= x1) {
			return true;
		} else {
			return false;
		}

	}

}
