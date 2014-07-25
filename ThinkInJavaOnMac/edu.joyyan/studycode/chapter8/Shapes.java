/**
 * Shapes.java [V1.00]
 * classpath:studycode.chapter8.Shapes
 * YanGJ create at 2014年6月1日 上午10:35:02
 */
package studycode.chapter8;

/**
 * studycode.chapter8.Shapes
 * 
 * @author YanGJ create at 2014年6月1日 上午10:35:02
 */
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = gen.next();
		}
		for (Shape s : shapes) {
			s.draw();
		}
	}

}
