package p1;

//in the below example EX5_1.test() is converted into Ex5.test() 
//automatically by compiler. 
public class Ex5_1 extends Ex5 {
	public static void main(String[] args) {
		Ex5_1.test(); // here no inheritance happening compiler is just
		// changing EX5_1.test() to Ex5.test() automatically
		// to avoid exception
	}
}
