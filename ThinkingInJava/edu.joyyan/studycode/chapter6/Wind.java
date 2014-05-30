/**
 * Wind.java [V1.00]
 * classpath:studycode.chapter6.Wind
 * YanGJ create at 2014年5月30日 上午11:05:09
 */
package studycode.chapter6;

import util.Print;

/**
 * studycode.chapter6.Wind
 * 
 * @author YanGJ create at 2014年5月30日 上午11:05:09
 */
public class Wind extends Instrument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);

	}

}

class Instrument {
	public void play() {
		Print.print("Instrument play");
	}

	static void tune(Instrument instrument) {
		Print.print("Instrument tune");
		instrument.play();
	}

}
