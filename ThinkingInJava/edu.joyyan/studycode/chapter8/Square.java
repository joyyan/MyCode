/**
 * Square.java [V1.00]
 * classpath:studycode.chapter8.Square
 * YanGJ create at 2014年6月1日 上午10:26:48
 */
package studycode.chapter8;

import static util.Print.*;
import util.Print;

/**
 * studycode.chapter8.Square
 * 
 * @author YanGJ create at 2014年6月1日 上午10:26:48
 */
public class Square implements Shape {
	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter8.Shape#draw()
	 */
	@Override
	public void draw() {
		print("Square.draw()");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter8.Shape#erase()
	 */
	@Override
	public void erase() {
		print("Square.erase()");
	}

	public void change() {
		Print.print("Square.change()");
	}
}
