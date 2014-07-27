/**
 * MyThread.java [V1.00]
 * classpath:studycode.chapter21Thread.MyThread
 * YanGJ create at 2014年7月25日 上午11:20:51
 */
package studycode.chapter21Thread;

/**
 * studycode.chapter21Thread.MyThread
 * 
 * @author YanGJ create at 2014年7月25日 上午11:20:51
 */
public class MyThread extends Thread {
	public void run() {
		for (int a = 0; a < 50; a++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " " + a);
		}
	}

	public static void main(String args[]) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
	}
}
