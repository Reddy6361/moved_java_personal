package p1;

/*Abstraction:
 * 1)Interface:
 * a) interface can consist of only incomplete methods in it.
 * b) abstract keyword helps us to define this method is incomplete, not 
 * mandatory to write it, we can write it at beginning or after 
 * public keyword.
 * c) it is the blueprint to project.
*/

/*Note : it is like constructing building , i.e. we should have a blue print 
 * , same way we should develop a blueprint i.e. which contains all 
 * the features which should be developed in project i.e. we 
 * create incomplete methods which are nothing but 
 * Features if we don't use that methods it will give 
 * error because class never allows incomplete methods. 
 * */

/*	Note:
 * interface file is also saved as .java only.
 * */
/*Note:
 * 1)java is not complete object oriented because we can run programs 
 * even without creating objects which is not mandatory.
 * */
public interface Ex7 { // interface
	public abstract void test(); // incomplete method
}
