package p1;

//e.printStackTrace() will give exact line number where exception happens.
public class Ex8 {
	public static void main(String[] args) {
		try {
			int x = 20;
			int y = 0;
			int z = x / y;// after exception no code will run
			System.out.println(z);// will not run
			System.out.println("hello"); // will not run
		} catch (Exception e) {
			e.printStackTrace();
			// will give exact line number where exception happens
		}
		System.out.println(100);// will run
	}
}
