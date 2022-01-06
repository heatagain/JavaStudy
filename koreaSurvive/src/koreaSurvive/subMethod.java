package koreaSurvive;

public class subMethod {

	
	public void timeDelay(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
