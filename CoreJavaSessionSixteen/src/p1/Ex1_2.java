package p1;

public class Ex1_2 implements Ex1_1 {

	@Override
	public void test1() {
		System.out.println(1);
	}

	@Override
	public void test2() {
		System.out.println(2);
	}

	public static void main(String[] args) {
		Ex1_2 c = new Ex1_2();
		c.test1();
		c.test2();
	}
}
