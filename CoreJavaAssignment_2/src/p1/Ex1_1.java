package p1;

public class Ex1_1 extends Ex1/*super class*/{
	public static void main(String[] args) {
		Ex1_1 b = new Ex1_1();
		b.test();
	}

	private void test() {
		System.out.println(super.i); // super keyword accesses parent 
		//class var.
	}
}
