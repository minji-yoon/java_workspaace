package ch03;

public class WhileDemo {

	public static void main(String[] args) {
		// 무한반복 while문
		while (true) {
			System.out.println("inginite-loop");
		}
		// 조건식이 false일 때 끝나는데, 조건이 true이므로 무한 반복

		// 아래의 3개의 반복문의 획수를 한번에 변경할 수 있도록 프로그램을 수정
		int count = 5;

		// 무한반복을 하지 않기 위해서는 앞에 초기식을 넣고, 뒤에 증감식을 넣어줘야한다.
		// 초기식 추가
		int i = 0;
//		while (i < 5) {
		while (i < count) {
			// 반복 실행문
			System.out.println("loop" + i + "번");
			// 증감식 추가
			i++;
		}

		// 다음의 for문과 동일한 코드이다.
//		for (int j = 0; j < 5; j++) {
//		System.out.println("loop" + j + "번");
//		}

		for (int j = 0; j < 5; j++) {
			System.out.println("loop" + j + "번");
		}

		// while문은 횟수가 정해져 있지 않는다.
		int k = 0;
		while (true) {
			System.out.println("loop" + k + "번");
			k++; // 여기도 무한반복
			// if문으로 조건을 걸어야한다
			if (k >= 5) {
				break; // 종료 명령어
			}
		}
	}

}
