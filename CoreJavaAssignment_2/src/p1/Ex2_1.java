package p1;

public class Ex2_1 extends Ex2/*super class*/{
	public static void main(String[] args) {
		Ex2_1 b = new Ex2_1();
		b.test();
	}

	private void test() {
		super.xyz(); // super keyword accesses parent 
		//class method.
	}
}
