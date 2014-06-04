/**
 * Circle.java [V1.00]
 * classpath:studycode.chapter8.Circle
 * YanGJ create at 2014年6月1日 上午10:28:12
 */
package studycode.chapter8;

import static util.Print.*;

/**
 * studycode.chapter8.Circle
 * 
 * @author YanGJ create at 2014年6月1日 上午10:28:12
 */
public class Circle extends Shape {
	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter8.Shape#draw()
	 */
	@Override
	public void draw() {
		print("Circle.draw()");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter8.Shape#erase()
	 */
	@Override
	public void erase() {
		print("Circle.erase()");
	}
}
