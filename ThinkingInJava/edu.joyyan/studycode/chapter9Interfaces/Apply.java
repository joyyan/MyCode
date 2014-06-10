/**
 * Apply.java [V1.00]
 * classpath:studycode.chapter9Interfaces.Apply
 * YanGJ create at 2014年6月10日 上午9:55:06
 */
package studycode.chapter9Interfaces;

import static util.Print.*;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter9Interfaces.Processor#process(java.lang.Object)
	 */
	@Override
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor {

	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Spiltter extends Processor {

	String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

/**
 * studycode.chapter9Interfaces.Apply
 * 
 * @author YanGJ create at 2014年6月10日 上午9:55:06
 */
public class Apply {

	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}

	public static String s = "Disagreement with beliefw is by definition incorrect";

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Spiltter(), s);

	}

}
