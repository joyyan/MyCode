/**
 * Sandwitch.java [V1.00]
 * classpath:studycode.chapter8.Sandwitch
 * YanGJ create at 2014年6月9日 下午3:28:05
 */
package studycode.chapter8;

import static util.Print.print;

class Meal {
	/**
	 * 
	 */
	public Meal() {
		print("Meal()");
	}
}

class Bread {
	/**
	 * 
	 */
	public Bread() {
		print("Bread()");
	}
}

class Cheese {
	/**
	 * 
	 */
	public Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	public static String aString;
	/**
	 * 
	 */
	public Lettuce() {
		print("Lettuce()");
		aString = "fhjshafd";
		print(aString);
	}
}

class Lunch extends Meal {
	/**
	 * 
	 */
	public Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	/**
	 * 
	 */
	public PortableLunch() {
		print("PortableLunch()");
	}
}

/**
 * studycode.chapter8.Sandwitch
 * 
 * @author YanGJ create at 2014年6月9日 下午3:28:05
 */
public class Sandwitch extends PortableLunch {

	private Bread bread = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	/**
	 * 
	 */
	public Sandwitch() {
		print("Sandwitch()");
	}

	public static void main(String[] args) {
		new Sandwitch();
	}

}
