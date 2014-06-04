/**
 * PrivateOverride.java [V1.00]
 * classpath:studycode.chapter8.PrivateOverride
 * YanGJ create at 2014年6月1日 上午10:48:27
 */
package studycode.chapter8;

import static util.Print.print;

/**
 * studycode.chapter8.PrivateOverride
 * 
 * @author YanGJ create at 2014年6月1日 上午10:48:27
 */
public class PrivateOverride {
	private void f() {
		print("private.f()");
	}
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		print("public.f()");
	}
}