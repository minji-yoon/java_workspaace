package ch02;

public class AlthmeticDemo {

	public static void main(String[] args) {
		long l = 100L;
		int i = 10;

		long result = l + i; // 연산식인 result 값은 long의 범위가 더 크기때문에 long으로 데이터타입을 정해야한다.,

		System.out.printf("%d와 %d의 + 연산 결과는 %d입니다.", l, i, result);

		double d = 100.0;
		int i1 = 10;

		double result1 = d + i1;

		System.out.printf("\n%f와 %d의 + 연산 결과는 %f입니다.", d, i1, result1); // 소수점자리를 지정하지 않으면 기본적으로는 소수점6자리까지 계산

		int a = 1_000_000;
		int b = 2_000_000;

		int res = a * b;
		System.out.printf("\n%d와 %d의 + 연산 결과는 %d입니다.", a, b, res); // 1000000와 2000000의 + 연산 결과는 -1454759936입니다.라는 결과가
																	// 나오는데 이건 오버플로우의 결과이다. 그 범위를 넘어가면 다시 가장 작은 숫자부터 가서

		int a1 = 1_000_000;
		int b1 = 2_000_000;
		long res1 = (long) a1 * b1; // int 끼리 계산하면 무조건 int 앞에 long지정해도 소용없음, 둘 중 하나는 long으로 형변환해야함
		System.out.printf("\n%d와 %d의 + 연산 결과는 %d입니다.\n", a1, b1, res1);

		int apple = 1;
		double pieceUnit = 0.1;

		double res2 = apple - pieceUnit;
		System.out.println(res2);

		float pieceUnit1 = 0.1f;
		int number = 7;

		float res3 = apple - pieceUnit1 * number;
		System.out.println(res3);

		// 나누기와 나머지 연산(0, 0.0으로 나누거나 나머지 연산 주의)
		// int res4 = 5 / 0;
		// System.out.println(res4);

		// int zero = 0;
		// int res5 = 5 / zero;
		// 에러 발생 : Exception in thread "main" java.lang.ArithmeticException: / by zero >
		// at sample/ch02.AlthmeticDemo.main(AlthmeticDemo.java:45)

		int zero1 = 0;
		// double res6 = 5/zero1;
		// System.out.println(5 / zero1); // 무한대값 발생
		// System.out.println(5 % zero1);

		int res9 = 4 / 3;
		double res10 = 4 / 3;
		double res11 = 4 / (double) 3;
		System.out.println(res9); // int를 int로 나누니까 결과값은 int여서 1
		System.out.println(res10); // int값을 int값으로 나누었기 때문에 결과가 1이고, 이를 double로 표시해서 1.0 > int값 둘 중 하나를 double로
									// 바꿔야함
		System.out.println(res11); // 1.3333333333333333333
		// but doudble(4/3)은 이미 안에서 결과가 1이 나왔기 때문에 res10과 결과가 같다.

		// 짝수 홀수 % 연산
		int three = 3;
		int res7 = three % 2;
		System.out.println(res7); // 홀수로 나누고 나머지는 1이다.

		int four = 4;
		int res8 = four % 2;
		System.out.println(res8); // 짝수로 나누고 나머지는 0이다.

	}

}
