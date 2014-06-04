/**
 * FieldAccess.java [V1.00]
 * classpath:studycode.chapter8.FieldAccess
 * YanGJ create at 2014年6月1日 下午12:53:02
 */
package studycode.chapter8;

/**
 * studycode.chapter8.FieldAccess
 * 
 * @author YanGJ create at 2014年6月1日 下午12:53:02
 */
public class FieldAccess {

	public static void main(String[] args) {
		Super sup = new Sub();
		System.out.println("sup.field = " + sup.field + "sup.getField() = "
				+ sup.getField());
		System.out.println("static f() "+ sup.getSuperName());
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field + "sub.getField() = "
				+ sub.getField() + "sub.getSuperField() = "
				+ sub.getSuperField());
		
		System.out.println("static f() "+ sub.getSuperName());
	}
}

class Super {
	public int field = 0;

	public int getField() {
		return field;
	}

	public static String getSuperName() {
		return "Super";
	}
}

class Sub extends Super {
	public int field = 1;

	public int getField() {
		return field;
	}

	public static String getSuperName() {
		return "SubSuper";
	}

	public int getSuperField() {
		return super.getField();
	}
}