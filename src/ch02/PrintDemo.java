package ch02;

public class PrintDemo {

	public static void main(String[] args) {
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.print("e");
		System.out.println("f");

		int x = 10;
		double pi = 3.14;
		System.out.printf("a is %d , pi is %-4.2f \n", x, pi); // 뒤의 공백 4개를 빼고, 2자리까지만 표기(%-4.2f)
	}

}
