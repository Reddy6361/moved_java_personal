package p1;

public class Ex8_1 /*no implements we have to write*/{
	public static void main(String[] args) {
		Ex8 ex = (/* no argument in method */) -> { //lambdas syntax
			System.out.println(100);
			System.out.println(200);
		};
		ex.test1();
	}
}
