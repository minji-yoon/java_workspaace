package ch02;

public class TypeCasting {

	public static void main(String[] args) {
		// 묵시적, 자동 형변환 : 값 손실이 없음
		double d1 = 5 * 3.14; // 5는 자동으로 5.0 double이 된다.(묵시적 자동 형변환) 연산에서 피연산자의 타입이 자동으로 변환
		double d2 = 1; // 1 > 1.0 으로 자동으로 형변환

		System.out.println(d1 + "과 " + d2); // 15.700000000000001(형변환시 발생하는 오류)과 1.0

		// 명시적, 강제 형변환 > 값 손실이 있음(있는 거 알지만 강제로 전환, ) 값 손실이 있을 때는 반드시 형변환 연산자를 써야한다.
		float f = (float) 3.14; // double인거 알지만 float로 강제 형변환해서 값 손실 인정하고 형변환할래 > 3.14f
		byte b = (byte) 300; // 44
		double d = 3.14f;// 원래 자동 형변환인데, 내가 강제로 형변환 줄 수 있다.

		System.out.println(f + ", " + b + ", " + d); // 3.14, 44, 3.140000104904175(float시 발생하는 오류)

		// 숫자를 문자로, 문자를 숫자로
		char c = 3 + '0'; // 문자 3이 된다. > '0' : 48 + 3 = 51"
		int i = '3' - '0'; // 숫자 3이된다. > '3' : 51 - 48 = 3

		// 숫자를 문자열로, 문자를 문자열로 변환
		String s = 3 + ""; // 숫자 3에 빈 문자열을 더하면 문자열 3이 된다.
		String s1 = '3' + ""; // 문자 3에 빈 문자열을 더하면 문자열 3이 된다.

		System.out.println("문자 c : " + c + "," + i);
		System.out.println("문자열 s : " + s + "," + s1);

		// 문자열을 문자로 변환
		System.out.println(s1.charAt(0));
		System.out.println("hello".charAt(1));
		System.out.println("안녕하세요".charAt(1));

		// 문자열을 숫자로(intm long, double)
		String str = "300";
		int value1 = Integer.parseInt(str); // integer이라는 클래스에서 사용할 수 있는 메서드 중 인트타입으로 반환
		System.out.println(value1 + 1);

		str = "3000000000000"; // L, __ 등 문자 형식 들어가면 안됨
		long value2 = Long.parseLong(str); // Long이라는 클래스의 도움을 받음 > long타임을 반환해줌
		System.out.println(value2);

		str = "3.14";
		double value3 = Double.parseDouble(str); // 더블이라는 클래스의 도움을 받아 더블 형태로 받아서 밸류3에 넣어줘
		System.out.println(value3);

	}

}
