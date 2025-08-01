package ch02;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// 연습 문제
		int mach;
		int distance;
		mach = 340;
		distance = mach * 60 * 60;
		System.err.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

		double radius;
		double area;
		radius = 10.0;
		area = radius * radius * 3.14;
		System.err.println("반지름이 " + radius + "인 원의 넓이는 " + area + "입니다.");

		char c = 'A';
		c = 'a';
		// c = "b"; //오류 발생 Exception(실행 시 오류) in thread "main" java.lang.Error:
		// Unresolved compilation(컴파일 할 때 오류) problem: Type mismatch: cannot convert
		// from String to char
		// > string은 4바이트, char은 2바이트 > 그러므로 문자열(4)를 넣을 수 없음
		System.out.println(c);

		final double PI;
		PI = 3.14159;
		System.err.println(PI);

		// PI = 3.14 //상수 값을 변경하려 하므로 오류 발생
		// System.err.println(PI);
	}

}
