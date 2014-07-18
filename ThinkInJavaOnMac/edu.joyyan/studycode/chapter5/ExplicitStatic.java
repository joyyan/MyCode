/**
 * ExplicitStatic.java [V1.00]
 * classpath:chapter5.ExplicitStatic
 * YanGJ create at 2014年5月28日 下午3:44:27
 */
package studycode.chapter5;

import util.Print;

/**
 * chapter5.ExplicitStatic
 * 
 * @author YanGJ create at 2014年5月28日 下午3:44:27
 */
public class ExplicitStatic {
	static int a[] = new int[5];

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Print.print("Inside main()");
		// Cups.cup1.f(99);
		// Cups cups = new Cups();
		// cups.cup2.f(88);
		Print.print(a[2]);
		Print.print(a[3]);
		f(a);
		Print.print(a.toString());
		Print.print(a[2]);
		Print.print(a[3]);
	}

	/**
	 * @param a
	 */
	private static void f(int[] w) {
		w[2] = 2;

	}
}


class Cup {
	int a;

	int[] array = new int[4];

	Cup(int marker) {
		Print.print("Cup(" + marker + ")");
		a = marker;
		Spiciness stateSpiciness = Spiciness.HIGH;
	}

	void f(int marker) {
		Print.print("f(" + marker + ")" + a);
		array[3] = 3;
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;

	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		Print.print("Cups()");
	}

}