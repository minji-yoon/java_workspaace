package ch03;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {

		// for (초기식; 조건식; 증감식)
		for (int i = 0; i < 3; i++) { // 증감식을 넣지 않으면, i는 계속 0이므로 조건식에 계속 부합되기 때문에 무한반복하게됨(끝날수있게 조건을 만족할 수 있게 해줘야함)
			System.out.println(1);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Hello world, " + (i + 1));
		}

		// 1부터 10까지 정수를 출력
		for (int i = 1; i < 11; i++) { // for (int i = 0; i < 10; i++)/for (int i = 1; i <= 10; i++)
			System.out.println(i); // System.out.println(i+1)/System.out.println(i)
		}

		// 10부터 1까지 출력
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// 구구단 2단
		for (int y = 1; y < 10; y++) {
			System.out.printf("%d * %d = %d \n", 2, y, 2 * y);
		}

		// 사용자가 원하는 단을 출력해주는 코드
		// Scanner를 선언한다.
		Scanner in = new Scanner(System.in);
		// 원하는 구구단을 입력하라는 출력문을 실행한다.
		System.out.println("출력하고자 하는 구구단을 입력하세요 : (2~19)");
		// 입력받은 숫자를 바탕으로 구구단을 출력한다.
		int dan = in.nextInt();
		
		for (int i = 1; i >= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}
	}
}