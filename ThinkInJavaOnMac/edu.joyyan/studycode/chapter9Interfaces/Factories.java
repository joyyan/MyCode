/**
 * Factories.java [V1.00]
 * classpath:studycode.chapter9Interfaces.Factories
 * YanGJ create at 2014年6月10日 下午8:00:42
 */
package studycode.chapter9Interfaces;

import static util.Print.*;

interface Service {
	void method1();

	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {

	public void method1() {
		print("Implementation1.method1()");
	}

	public void method2() {
		print("Implementation1.method2()");
	}

}

class Implementation1Factory implements ServiceFactory {

	public Service getService() {
		return new Implementation1();
	}

}

class Implementation2 implements Service {

	public void method1() {
		print("Implementation2.method1()");
	}

	public void method2() {
		print("Implementation2.method2()");
	}

}

class Implementation2Factory implements ServiceFactory {

	public Service getService() {
		return new Implementation2();
	}

}


/**
 * studycode.chapter9Interfaces.Factories
 * 
 * @author YanGJ create at 2014年6月10日 下午8:00:42
 */
public class Factories {
	
	public static void serviceConsumer(ServiceFactory factory){
		Service s = factory.getService();
		s.method1();
		s.method2();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());

	}

}
