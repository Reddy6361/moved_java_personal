package p1;
// if your child class constructor consist of this keyword then
// that constructor then super keyword will not be automatically placed.
public class Ex13_1 extends Ex13{
	Ex13_1(){
		System.out.println("from child class constructor no arrgs");
	}
	Ex13_1(int i){
//		this(); super(); //error 
		this();// if there is this keyword super() keyword cannot
		//be automatically placed.
		System.out.println(i);
	}
public static void main(String[] args) {
	
}
}
