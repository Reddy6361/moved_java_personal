package p1;
/*
 * Example 2 Arrays.
 * */
public class Ex8 {
	public static void main(String[] args) {
		int [] arr = new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		System.out.println(arr[0]); // 10
		System.out.println(arr[1]); // 20
		System.out.println(arr[2]); // 30
		System.out.println(arr[3]); // 0 -> as size of array is 4
		// if no value is assigned by default it is 0.
	}
}
