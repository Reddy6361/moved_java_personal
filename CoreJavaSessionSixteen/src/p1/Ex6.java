package p1;

/*
 * final keyword:
 * 1) if you make a variable final then we cannot change its value.
 * 2) if you make static/ non static variable as final and if not  initialize
 * then it will give error.
 * 3) all final variable should be written in all upper cases.
 * 4) if you make class as final then inheritance is not allowed.
 * 5) if you make a method final then overriding is not possible.
 * */
public class Ex6 {
	public static void main(String[] args) {
		final int x = 10;
		// x= 10; we cannot change with the same value or different value.
		System.out.println(x);
	}
}
