/**
 * PolyConstructors.java [V1.00]
 * classpath:studycode.chapter8.PolyConstructors
 * YanGJ create at 2014年6月9日 下午4:05:00
 */
package studycode.chapter8;

import static util.Print.*;

abstract class Glyph {
	void draw() {
		print("Glyph.draw()");
	}

	Glyph() {
		print("Glyph before draw()");
		draw();
		print("Glyph after draw()");
	}
	abstract void f();
}

class RoundGlyph extends Glyph {

	private int radius = 1;

	/**
	 * 
	 */
	public RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw() {
		print("RoundGlyph.draw(), radius = " + radius);
	}
	/* (non-Javadoc)
	 * @see studycode.chapter8.Glyph#f()
	 */
	@Override
	void f() {
		// TODO Auto-generated method stub
		
	}
}

/**
 * studycode.chapter8.PolyConstructors
 * 
 * @author YanGJ create at 2014年6月9日 下午4:05:00
 */
public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
