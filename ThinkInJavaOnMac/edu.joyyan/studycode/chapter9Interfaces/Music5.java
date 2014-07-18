/**
 * Music5.java [V1.00]
 * classpath:studycode.chapter9Interfaces.Music5
 * YanGJ create at 2014��6��9�� ����5:24:00
 */
package studycode.chapter9Interfaces;

import static util.Print.*;

interface Instrument {
	int VALUE = 5; // static & final

	void play(Note n);

	void adjust();

}

class Wind implements Instrument {

	public void play(Note n) {
		print(this + ".play()" + n);

	}

	
	public void adjust() {
		print(this + ".adjust()");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Wind";
	}
}

class Percussion implements Instrument {
	public void play(Note n) {
		print(this + ".play()" + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	public String toString() {
		return "Percussion";
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		print(this + ".play()" + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {

	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {

	public String toString() {
		return "Woodwind";
	}
}

/**
 * studycode.chapter9Interfaces.Music5
 * 
 * @author YanGJ create at 2014��6��9�� ����5:24:00
 */
public class Music5 {

	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i :e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
		tuneAll(orchestra);
	}
}
