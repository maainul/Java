/**
 * @Author Md. Mainul Hasan
 * 
 * 10:27:34 AM
 * 
 * September 27, 2020
 *
 */
package oopConcept.modifires.protectedAccess.shore;

public class BirdWatcher {
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatingWater();
		System.out.println(bird.text);
	}
}
