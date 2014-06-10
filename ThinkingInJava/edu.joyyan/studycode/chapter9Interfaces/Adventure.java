/**
 * Adventure.java [V1.00]
 * classpath:studycode.chapter9Interfaces.Adventure
 * YanGJ create at 2014年6月10日 上午10:27:19
 */
package studycode.chapter9Interfaces;

import static util.Print.*;

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
		print("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

	public void swim() {
		print("Hero.swim()");
	}

	public void fly() {
		print("Hero.fly()");
	}

}

/**
 * studycode.chapter9Interfaces.Adventure
 * 
 * @author YanGJ create at 2014年6月10日 上午10:27:19
 */
public class Adventure {

	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x) {
		x.swim();
	}
	public static void v(CanFly x) {
		x.fly();
	}
	public static void w(ActionCharacter x) {
		x.fight();
	}
	public static void main(String[] args) {
		Hero h =new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
