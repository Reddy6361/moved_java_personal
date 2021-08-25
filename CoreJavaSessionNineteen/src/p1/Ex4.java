package p1;

/*
 * Example 2: Null pointer Exception- with null RV when 
 * we access non static members we get Null Pointer Exception.
 * */
public class Ex4 {
	static Ex4 ex; // null reference variable.
	int x = 10;

	public static void main(String[] args) {
		try{
			System.out.println(ex.x);
			}catch(NullPointerException e) {// only handles null pointer 
				// it can't handle any other exception.
				e.printStackTrace();
		}
	}
}
