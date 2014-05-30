/**
 * Beetle.java [V1.00]
 * classpath:studycode.chapter6.Beetle
 * YanGJ create at 2014年5月30日 下午3:51:42
 */
package studycode.chapter6;

import static util.Print.*;

/**
 * studycode.chapter6.Beetle
 * 
 * @author YanGJ create at 2014年5月30日 下午3:51:42
 */
public class Beetle extends Insect {

	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		print("Beetle construct");
		print("k = " + k);
		print("j = " + j);
	}

	private static int x2 = printInit("static Beetle.x2 initialized");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		print("Beetle constructor");
		Beetle beetle = new Beetle();
	}

}

class Insect {
	private int i = 9;
	protected int j;

	/**
	 * 
	 */
	// public Insect() {
	// // TODO Auto-generated constructor stub
	// }
	public Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		print("printInit()" + s);
		return 47;

	}

}