package p1;

public class Ex4_1 extends Ex1/* super class */ {
	public static void main(String[] args) {
		Ex4_1 b = new Ex4_1();
		b.test();
		Ex4_1.test1();
	}

	private static void test1() {
//		System.out.println(super.i);//error.
	}

	private void test() {
		System.out.println(super.i); // super keyword accesses parent
		// class variable even if it is static variable.
	}

}
