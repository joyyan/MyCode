/**
 * MyThread2.java [V1.00]
 * classpath:studycode.chapter21Thread.MyThread2
 * YanGJ create at 2014年7月25日 上午11:27:03
 */
package studycode.chapter21Thread;

/**
 * studycode.chapter21Thread.MyThread2
 * 
 * @author YanGJ create at 2014年7月25日 上午11:27:03
 */
public class MyThread2 extends Thread {
	public void run() {
		for (int a = 0; a < 10; a++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + " " + a);
		}
	}

	public static void main(String args[]) {
		MyThread2 t1 = new MyThread2();
		t1.start();
		t1.run();
	}
}
