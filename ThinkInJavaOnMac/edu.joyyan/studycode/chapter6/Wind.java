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
public class Wind extends Instrument2 {

	private int i = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);

	}
	/* (non-Javadoc)
	 * @see studycode.chapter6.Instrument2#play()
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		super.play();
	}
}


class Instrument2 extends Instrument{

	/* (non-Javadoc)
	 * @see studycode.chapter6.Instrument#play()
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}
abstract class Instrument {
	public abstract void play();

	static void tune(Instrument instrument) {
		Print.print("Instrument tune");
		instrument.play();
	}

}
