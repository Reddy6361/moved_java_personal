package p1;

public class Ex10_1 {
	public static void main(String[] args) {
		Ex10 ex = (int x) -> System.out.println(x); 
		// single line lambdas syntax when only one
		//sentence is present no need to use {}
		ex.test1(100); // calls lambdas
	}
}

