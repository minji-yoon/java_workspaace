package ch02;

public class CompLogicDemo {

	public static void main(String[] args) {
		// 비교 연산
		int x = 0, y = 1;
		System.out.println(x < y); // 결과값 true
		System.out.println(x > y); // 결과값 false

		// 논리연산
		System.out.println(x < y && x == 0);

		// 쇼트서킷 (논리 &&) : 조건식 1이 false이면 조건식 2는 연산하지 않음, 조사하지 않고 성능개선
		System.out.println(x > y && 5 / 0 == 0); // 뒤에 5 / 0 == 0 은 오류가 발생해야하는데, 앞의 값이 false이기 때문에 조건식 2는 계산을 안해서 결과값이
													// 그냥 false가 나온다.

		// 쇼트서킷 (논리 ||) : 조건식 1이 true이면 조건식 2는 조사하지 않고 성능 개선
		System.out.println(x < y || 5 / 0 == 0); // 뒤에 5 / 0 == 0 은 오류가 발생해야하는데, 앞의 값이 true이기 때문에 조건식 2는 계산을 안해서 결과값이 그냥
													// true가 나온다.

	}

}
