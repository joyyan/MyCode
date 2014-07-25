/**
 * Parcel5.java [V1.00]
 * classpath:studycode.chapter10InnerClass.Parcel5
 * YanGJ create at 2014年6月17日 上午9:46:04
 */
package studycode.chapter10InnerClass;

/**
 * studycode.chapter10InnerClass.Parcel5
 * 
 * @author YanGJ create at 2014年6月17日 上午9:46:04
 */
public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}

		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destination d = parcel5.destination("Beijing");
	}

}
