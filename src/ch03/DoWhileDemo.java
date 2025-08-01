package ch03;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("값을 입력하세요 : ");
			num = in.nextInt();
		} while (num > 0); // 조건을 만족하지 않더라도 조건식을 한번은 실행함(dowhile의 특징)
		System.out.println("프로그램을 종료합니다.");

		// 1~10까지의 짝수만 출력
		int number = 0;
		while (number <= 10) {
			number++;
//			if (number % 2 == 0) {
//				System.out.println(number);
//			} else {
//				continue;
//			}

			// 위와 동일한 결과값을 반출하는 코드
			if (number % 2 == 1) {
				continue;
			}
			System.out.println(number);
		}
	}

}
