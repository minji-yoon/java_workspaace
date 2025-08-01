package ch03;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// Scanner를 선언한다.
		Scanner in = new Scanner(System.in);

		// 점수를 입력하라는 출력문을 실행한다.
		System.out.println("점수를 입력하세요. : (1~100)");

		// 점수를 입력 받는다.
		int score = in.nextInt(); // 값은 정수를 받겠다.
		String grade = ""; // 할당하지 않으면 null값을 부여하기 때문에 ""빈 문자열을 줘서 해결한다.

		// 다중 If문으로 입력받은 점수의 학점을 계산한다.
		if (score >= 90 && score <= 100) { // A
			grade = "A";
		} else if (score >= 80 && score > 90) { // B
			grade = "B";
		} else if (score >= 70) { // C
			grade = "C";
		} else if (score < 70) { // F
			grade = "F";
		}

		// 학접을 출력한다.
		System.out.printf("당신의 학점은 " + grade + "입니다.");
	}

}
