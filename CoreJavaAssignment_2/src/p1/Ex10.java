package p1;
// if in the parent class there is only constructors with arguments
//then as a programmer we should explicitly write super() with arguments
// which matches in child class constructor.
public class Ex10 {
	Ex10(int i){
		System.out.println("parent class constructor");
		System.out.println(i);
	}
}
