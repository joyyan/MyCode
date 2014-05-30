/**
 * FinalOrerridingIllusion.java [V1.00]
 * classpath:studycode.chapter6.FinalOrerridingIllusion
 * YanGJ create at 2014年5月30日 下午3:16:33
 */
package studycode.chapter6;

import static util.Print.*;

/**
 * studycode.chapter6.FinalOrerridingIllusion
 * 
 * @author YanGJ create at 2014年5月30日 下午3:16:33
 */
public class FinalOrerridingIllusion {
	public static void main(String[] args) {

		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
//		op.f(i);
	}
}

class WithFinals {
	private final void f() {
		print("WithFinals.f()");
	}

	private final void g() {
		print("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		print("OverridingPrivate.f()");
	}

	private void g() {
		print("OverridingPrivate.g()");
	}

	private void f(int i) {

	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}

	public void g() {
		print("OverridingPrivate2.g()");
	}
}