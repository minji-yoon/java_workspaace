package sec07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// 스캐너 객체 할당
		Scanner in = new Scanner(System.in);

		// 동적 배열 선언 : 크기가 유동적인 배열
		ArrayList<Integer> scores = new ArrayList<>();

		// 표준 입력장치에서 원하는 횟수만큼 점수를 입력 받아서 배열에 저장, 종료하려면 -1을 입력
		int score = 0;
		while (true) {
			System.out.println("학생의 점수를 입력하세요 : (종료하려면 -1 입력)");
			int score = in.nextInt();
			if (score < 0) {
				break;
			}

			scores.add(score);
		}
		int count = scores.size();
		
		// 점수가 50점 이하인 학생은 동적 배열에서 삭제
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) <= 50) {
			    scores.remove(i);	
			}
	
		// 동적 배열의 크기 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
			System.out.printf("학생 %d명의 점수의 합은 %d입니다.\n", scores.size(), sum);
			System.out.printf("학생 %d명의 점수의 평균은 %.2f입니다.\n", scores.size(), (sum / (double) scores.size(),));
		}

}