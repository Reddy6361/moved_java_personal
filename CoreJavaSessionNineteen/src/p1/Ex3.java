package p1;

/*
 * Example 1:
 * */
public class Ex3 {
	public static void main(String[] args) {
		try {
			int x = 10;
			int z = 0;
			int y = x / z;
			System.out.println(y);
		} catch (ArithmeticException e) {// only handles ArithmeticException
			// it can't handle any other exception.
			e.printStackTrace();
		}
	}
}
