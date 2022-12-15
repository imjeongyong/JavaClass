package chapter12;

public class ThreadExample {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread Thread = new Thread(beepTask);
		Thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("똥");
			try {
				java.lang.Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}