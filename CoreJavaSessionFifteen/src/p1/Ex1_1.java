package p1;
//continuation of Ex1
public class Ex1_1 extends Ex1 {
	@Override
	public void test() {
		System.out.println(30);
	}
	public static void main(String[] args) {
		Ex1 ex = new Ex1_1(); //class up-casting
		ex.test();
	}
}
