package sec07;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 배열 선언 : 크기가 100이고 점수를 담고 있는 배열
		int[] scores = new int[100];

		// 표준 입력장치에서 원하는 횟수만큼 점수를 입력 받아서 배열에 저장, 종료하려면 -1을 입력,
		// 종료될때까지 입력 받은 학생의 수 count
		System.out.println("학생의 점수를 입력하세요 : (종료하려면 -1 입력)");
		int count = 0;
		while (true) {
			int score = in.nextInt();
			if (score == -1) {
				System.out.println("입력을 종료합니다.");
				break;
			}

			if (count >= scores.length) {
				System.out.println("최대 100명까지만 입력할 수 있습니다.");
				break;
			}

			scores[count] = score;
			count++;
		}
//		for (int i = 0; i < 5; i++) {
//			scores[i] = in.nextInt(); // in.nextInt는 입력하는 명령어(정수로 입력)
//		}

		// 해당 배열에서 count한 학생의 수만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += scores[i];

		}

		if (count > 0) {
			System.out.printf("학생 %d명의 점수의 합은 %d입니다.\n", count, sum);
			System.out.printf("학생 %d명의 점수의 평균은 %.2f입니다.\n", count, (sum / (double) count));
		} else {
			System.out.println("입력된 점수가 없습니다.");
		}
		in.close();// Scanner 닫기 (자원해제)
	}

}
