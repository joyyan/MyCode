package studycode.chapter8;
import java.util.Random;

/**
 * RandomShapeGenerator.java [V1.00]
 * classpath:.RandomShapeGenerator
 * YanGJ create at 2014年6月1日 上午10:30:27
 */

/**
 * .RandomShapeGenerator
 * 
 * @author YanGJ create at 2014年6月1日 上午10:30:27
 */
public class RandomShapeGenerator {

	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}

}
