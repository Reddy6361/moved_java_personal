package p1;

public class Ex2_1 extends Ex2 {
	@Override
	public void test() { //no error
		System.out.println(30);
	}
	public static void main(String[] args) {
		Ex1 ex = new Ex1_1(); //class up-casting
		ex.test();
	}
}
