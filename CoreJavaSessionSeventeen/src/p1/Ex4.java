package p1;

/*Java 8 new features
 * 1) default keyword: this keyword helps us to create complete methods 
 * inside interface, this features was introduced in version 8 of java.
 * */
public interface Ex4 {
	default void test() { // we can use to create complete methods.
		System.out.println(100);
	}
}
