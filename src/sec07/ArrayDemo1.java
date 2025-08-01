package sec07;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 배열 선언 : 크기가 5이고 점수를 담고 있는 배열
		int[] scores = new int[5];

		// 표준 입력장치에서 5번 점수를 입력 받아서 배열에 저장
		System.out.println("학생 5명의 점수를 입력하세요 : ");
		for (int i = 0; i < 5; i++) {
			scores[i] = in.nextInt(); // in.nextInt는 입력하는 명령어(정수로 입력)
		}

		// 해당 배열에서 5번 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		for (int score : scores) {
			sum += score;

		} // for 컨트롤 스페이스바 누르면 자동 설정

		System.out.printf("학생 %d명의 점수의 합은 %d입니다.\n", scores.length, sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f입니다.\n", scores.length, (sum / (double) scores.length));

	}

}
