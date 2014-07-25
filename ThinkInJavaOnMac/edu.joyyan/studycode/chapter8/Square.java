/**
 * Square.java [V1.00]
 * classpath:studycode.chapter8.Square
 * YanGJ create at 2014��6��1�� ����10:26:48
 */
package studycode.chapter8;

import static util.Print.print;
import util.Print;

/**
 * studycode.chapter8.Square
 * 
 * @author YanGJ create at 2014��6��1�� ����10:26:48
 */
public class Square implements Shape {
	public void draw() {
		print("Square.draw()");
	}

	
	public void erase() {
		print("Square.erase()");
	}

	public void change() {
		Print.print("Square.change()");
	}
}
