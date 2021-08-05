//special way to pass arguments into methoed.
public class Ex2 {
	public static void main(String[] args) {
		Ex2 ex = new Ex2();
		ex.test(10, 20, 30, 40);
	}

	private void test(int... i) {
		// TODO Auto-generated method stub
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
	}
}
