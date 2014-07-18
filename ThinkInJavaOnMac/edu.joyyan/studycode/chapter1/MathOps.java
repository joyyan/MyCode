/**
 * MathOps.java [V1.00]
 * classpath:chapter1.MathOps
 * YanGJ create at 2014年5月23日 下午2:53:14
 */
package studycode.chapter1;

import java.util.Random;

import util.Print;

/**
 * chapter1.MathOps
 * 
 * @author YanGJ create at 2014年5月23日 下午2:53:14
 */
public class MathOps {

	public static void main(String[] args) {
		// Create a seeded random number generator:
		Random rand = new Random(47);
		int i, j, k;
		// choose value from 1 to 100
		j = rand.nextInt(100) + 1;
		Print.print("j = " + j);
		k = rand.nextInt(100) + 1;
		Print.print("k = " + k);
		i = j + k;
		Print.print("j + k = " + i);
		i = j - k;
		Print.print("j - k = " + i);
		i = k / j;
		Print.print("k / j = " + i);
		i = k * j;
		Print.print("k * j = " + i);
		i = k % j;
		Print.print("k % j = " + i);
		i = j % k;
		Print.print("j % k = " + i);

		float u, v, w;

		v = rand.nextFloat();
		Print.print("v = " + v);
		w = rand.nextFloat();
		Print.print("u = " + w);
		u = v + w;
		u += v;
		Print.print("u += v : " + u);

	}
}
