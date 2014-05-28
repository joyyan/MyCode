/**
 * PassingThis.java [V1.00]
 * classpath:chapter5.PassingThis
 * YanGJ create at 2014年5月27日 下午8:08:48
 */
package studycode.chapter5;

/**
 * chapter5.PassingThis
 * 
 * @author YanGJ create at 2014年5月27日 下午8:08:48
 */

class Person {
	/**
	 * 
	 */
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		return apple;
	}
}

class Apple {
	/**
	 * 
	 */
	int a;
	String b;
	Apple() {
		// TODO Auto-generated constructor stub
	}

	Apple(int a) {
		this.a = a;
	}
	Apple(String a) {
		this.b = a;
	}

	Apple(String aString,int a) {
//		this(3);
		this("d");
		String xString = "d";


	}
//	void f(){
//		int i;
//		i++; //The local variable i may not have been initialized
//	}

	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

public class PassingThis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Person().eat(new Apple());

	}

}
