package p1;

public class EX8_1 extends Ex8 {
	EX8_1(){
		//super(); will always be added by default buy compiler.
		System.out.println("child class constructor.");
	}
	public static void main(String[] args) {
		new EX8_1();
	}
}
