package p1;

public class Ex10_1 extends Ex10 {
	Ex10_1(){
		super(10); //we should explicitly write with arguments.
		System.out.println("child class constructor.");
	}
	public static void main(String[] args) {
		new Ex10_1();
	}
}
