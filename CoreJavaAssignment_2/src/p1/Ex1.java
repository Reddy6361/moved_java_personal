package p1;
/*super keyword():
 * 1) using super keyword we can access the members of parent class.
 * 2) using super keyword we can access static and non static members both
 * 3) using super() keyword we can call constructor of parent class but then
 * we should super keyword in child class constructor and it should be the 
 * very first statement.
 * 4) if we don't keep super keyword inside child class constructor
 *  then compiler will automatically place the super keyword
 *  such that it can call only no argument constructor of parent class.
 *  5) super() keyword will only call no args constructor.
 * */
/*limitations:
 * 1) super keyword cannot be used inside static methods
 * 2) super() keyword should be the first statement in the child
 *  class constructor.
 *  3) we cannot call parent class constructor from child class method
 *   using super() keyword.
 * */
/*super class is also called as parent class.
 * */
public class Ex1 {
	int i = 10;
}
