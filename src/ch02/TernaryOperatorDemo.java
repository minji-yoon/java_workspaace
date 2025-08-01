package ch02;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int x = 1, y, z;

		y = (x == 1) ? 10 : 20; // 조건문이 참이면 10, 거짓이면 20

		System.out.println(y);

		z = (x == 1) ? 10 : (5 / 0);
		System.out.println(z); // 쇼트서킷으로 뒤에는 계산하지 않아서 오류가 발생하지 않음

		int a, b, c;
		a = b = c = 3;

		c = a * b / c % 2;
		System.out.println(c);

		c = a++ + --b * a;
		System.out.println(c);
	}

}
