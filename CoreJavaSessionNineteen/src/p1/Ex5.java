package p1;

/*
 * Note:Exception class can handle any kind of Exceptions.
 * */
public class Ex5 {
	static Ex5 ex; // null reference variable.
	int x = 10;

	public static void main(String[] args) {
		try {
			System.out.println(ex.x);// null pointer Exception
			int z = 10/0;// divisible by zero Exception
			System.out.println(z);
		} catch (Exception e) { // it will handle all classes of Exception
			e.printStackTrace();
		}
	}
}
