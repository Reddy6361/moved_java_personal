package p1;

public class Ex12_1 extends Ex12{
	Ex12_1(){
		//super keyword kept by default
		System.out.println("from parent constructor.");
	}
	Ex12_1(int i){
		//super keyword kept by default
		System.out.println("from parent args constructor.");
	}
	
 public static void main(String[] args) {
	new Ex12_1();
	new Ex12_1(10);
}
}
