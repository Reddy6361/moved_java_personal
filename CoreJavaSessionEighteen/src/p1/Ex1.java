package p1;

/*Abstract classes in java:
 * 1) an abstract class can consist of complete and incomplete methods.
 * 2) to create incomplete method it is mandatory to use abstract keyword.
 * 3) an abstract class can be 0-100% incomplete.
 * 4) an abstract class can consist of main method.
 * 5) reference variable of abstract class can be created but an object 
 * of an abstract class cannot be created.
 * */
abstract public class Ex1 {
	static int y = 20;
	int x = 30;// only by inheritance we can access it

	public abstract void test();

	public void test2() { // only by inheritance we can access it
		System.out.println(200);
	}

	public static void main(String[] args) {
		// A a1 /*can create reference variable*/ /* =new A();*/ //error
		System.out.println(Ex1.y);
	}
}
