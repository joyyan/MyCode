/**
 * PassObject.java [V1.00]
 * classpath:chapter1.PassObject
 * YanGJ create at 2014��5��23�� ����2:44:12
 */
package chapter1;

import util.Print;

/**
 * chapter1.PassObject
 * 
 * @author YanGJ create at 2014��5��23�� ����2:44:12
 */
class Letter {
	char c;
}

public class PassObject {
	static void f(Letter y) {
		y.c = 'z';
		//f()ʵ���޸���֮��Ķ���
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		Print.println("1:x.c = " + x.c);
		f(x);
		Print.println("2:x.c = " + x.c);
     	}
} /*output: 
 * 1:x.c = a 
 * 2:x.c = z
 */// ~
