package p1;

public class Ex7_1 implements Ex7 {// implements is the keyword used to
	// do inheritance between class and interface.
	@Override
	public void test() { // completing interface method is mandatory
//		if not it will give error.
		System.out.println(100);
	}

	public static void main(String[] args) {
		Ex7_1 ex7_1 = new Ex7_1();
		ex7_1.test();
	}

}
