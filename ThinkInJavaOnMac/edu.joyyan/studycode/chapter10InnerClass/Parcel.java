/**
 * Parcel.java [V1.00]
 * classpath:studycode.chapter10InnerClass.Parcel
 * YanGJ create at 2014年6月10日 下午8:26:49
 */
package studycode.chapter10InnerClass;

/**
 * studycode.chapter10InnerClass.Parcel
 * @author YanGJ create at 2014年6月10日 下午8:26:49
 */
public class Parcel {

	class Contents {
		private int i = 11;
		public int value(){
			return i;
		}
	}
	
	class Destination{
		private String label;
		/**
		 * 
		 */
		public Destination(String wereTo) {
			// TODO Auto-generated constructor stub
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
