/**
 * Detergent.java [V1.00]
 * classpath:studycode.chapter6.Detergent
 * YanGJ create at 2014年5月29日 下午5:20:03
 */
package studycode.chapter6;

import static util.Print.*;

/**
 * studycode.chapter6.Detergent
 * 
 * @author YanGJ create at 2014年5月29日 下午5:20:03
 */
class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

public class Detergent extends Cleanser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter6.Cleanser#scrub()
	 */
	@Override
	public void scrub() {
		// super.scrub();
		append(" Detergent.scrub()");
	}

	public void foam() {
		append(" foam()");
	}

	public void dilute() {
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}
/*
 * output: Cleanser dilute() apply() Detergent.scrub() scrub() foam() Testing
 * base class: Cleanser dilute() apply() scrub()
 */// ~
