package p1;
// super key is not auto kept when there are only constructors with 
//arguments in parent class, where as super keyword will be placed //automatically when in parent class there is constructor with no arguments.
public class Ex11 {
	Ex11(int i){
		System.out.println("parent class constructor");
		System.out.println(i);
	}
	Ex11(){
		System.out.println("from no args constructor.");
	}
}
