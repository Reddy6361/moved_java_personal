package p1;

public class Ex11_1 {
	public static void main(String[] args) {
		Ex11 ex = () -> {return 100;} ;
		// single line lambdas syntax when only one
		//sentence is present no need to use {}
	
		int val = ex.test1();
		System.out.println(val);
		
		
	}
}
