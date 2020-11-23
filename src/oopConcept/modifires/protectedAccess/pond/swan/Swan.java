/**
 * @Author Md. Mainul Hasan
 * 
 * 10:38:56 AM
 * 
 * Sep 27, 2020
 *
 */
package oopConcept.modifires.protectedAccess.pond.swan;

public class Swan extends Bird {
	public void swim() {
		floatingWater();
		System.out.println(text);
	}

	public void helpOtherSwanSwim() {
		Swan otherSwan = new Swan();
		otherSwan.floatingWater();
		System.out.println(otherSwan.text);
	}

	public void helpOtherBirdSwim() {
		Bird otherBird = new Bird();
		otherBird.floatingWater(); // DOES NOT COMPILE
		System.out.println(otherBird.text); // DOES NOT COMPILE
	}

}
