package p1;

/*
 * Number format Exception: when an invalid string to number
 * conversion is done we will get number format exception as shown below.
 * */
// in String anything in "" is a number then it can be converted into number
// but anything else it wont.
public class Ex6 {
	public static void main(String[] args) {
		try {
	//String x = "testing"; // 10 -accepted 10.3 - accepted // Exception
			String x = "10.3"; //correct way of writing 
			float val = Float.parseFloat(x);
			System.out.println(val);// class which converts string into integer.

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
/*
 * try {
 * 
 * }catch(Exception e) { e.printStackTrace(); }
 */