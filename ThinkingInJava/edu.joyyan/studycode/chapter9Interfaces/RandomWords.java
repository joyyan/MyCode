/**
 * RandomWords.java [V1.00]
 * classpath:studycode.chapter9Interfaces.RandomWords
 * YanGJ create at 2014年6月10日 下午3:29:21
 */
package studycode.chapter9Interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * studycode.chapter9Interfaces.RandomWords
 * 
 * @author YanGJ create at 2014年6月10日 下午3:29:21
 */
public class RandomWords implements Readable {

	private static Random random = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			.toCharArray();
	private static final char[] lower = "abcdefghijklmnopqrstuvwxyz"
			.toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;

	public RandomWords(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1;
		}
		cb.append(capitals[random.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(capitals[random.nextInt(vowels.length)]);
			cb.append(lower[random.nextInt(lower.length)]);
		}
		cb.append(" ");
		return 10;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new RandomWords(10));
		while (s.hasNext()) {
			System.out.println(s.next());

		}
	}

}
