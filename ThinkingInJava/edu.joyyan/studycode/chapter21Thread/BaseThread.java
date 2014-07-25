package studycode.chapter21Thread;

public class BaseThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		System.out.print("waiting for liftoff");

		for (int i = 0; i < 5; i++) {
			new Thread(new LiftOff()).start();
			System.out.println(); 
		}
		System.out.print("waiting for liftoff");
	}

}
