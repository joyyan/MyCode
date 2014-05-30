/**
 * BlankFinal.java [V1.00]
 * classpath:studycode.chapter6.BlankFinal
 * YanGJ create at 2014年5月30日 下午2:57:32
 */
package studycode.chapter6;

/**
 * studycode.chapter6.BlankFinal
 * 
 * @author YanGJ create at 2014年5月30日 下午2:57:32
 */
public class BlankFinal {

	private final int i = 0;
	private final int j;
	private final Poppet p;

	public BlankFinal() {
		j = 1;
		p = new Poppet(1);
	}

	public BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
	}

	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
	}
}

class Poppet {
	int i;

	/**
	 * 
	 */
	public Poppet(int ii) {
		i = ii;
	}
}