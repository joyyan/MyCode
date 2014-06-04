/**
 * Triangle.java [V1.00]
 * classpath:studycode.chapter8.Triangle
 * YanGJ create at 2014年6月1日 上午10:29:25
 */
package studycode.chapter8;

import static util.Print.*;

/**
 * studycode.chapter8.Triangle
 * @author YanGJ create at 2014年6月1日 上午10:29:25
 */
public class Triangle extends Shape {
	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter8.Shape#draw()
	 */
	@Override
	public void draw() {
		print("Triangle.draw()");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see studycode.chapter8.Shape#erase()
	 */
	@Override
	public void erase() {
		print("Triangle.erase()");
	}
}
