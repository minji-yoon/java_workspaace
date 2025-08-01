package sec07;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] scores = { 92, 100, 85, 78, 69 }; // 처음부터 5값을 가지는 배열을 만들어 초기화해서 값을 부여
		int sum = 0;

		// 배열은 안의 변수를 각각 입력하지 않고 반복문을 사용할 수 있다는 점이다.
//		sum = sum + scores[0];
//		sum = sum + scores[1];
//		sum = sum + scores[2];
//		sum = sum + scores[3];
//		sum = sum + scores[4];
//		
		for (int i = 0; i < 5; i++) {
			sum = sum + scores[i];
		}
//		scores.length // 변하지 않는 배열의 크기

		System.out.printf("학생 %d명의 점수의 합은 %d입니다.\n", scores.length, sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f입니다.\n", scores.length, (sum / (double) scores.length));

		// 4명의 학생의 점수를 추가하더라도 점수만 더 입력해놓으면 알아서 다시 계산해줌
		int[] scores1 = { 92, 100, 85, 78, 69, 90, 50, 60, 99 };
		for (int i = 0; i < 5; i++) {
			sum = sum + scores1[i];
		}
		System.out.printf("학생 %d명의 점수의 합은 %d입니다.\n", scores1.length, sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f입니다.\n", scores1.length, (sum / (double) scores1.length));

		// 배열의 출력
		int[] arr = { 1, 2, 3, 4, 5 };
		// String도 어찌보면 문자열의 배열
		String str = "hello";
		// System.out.println(arr); //[I@3d646c37 : 주소가 출력되지, 특정 값이 출력되지 않음/배열은 각 값을 출력할
		// 수는 없음
		System.out.println(Arrays.toString(arr)); // Arrays는 java.util에 있음(다른 예가 Scanner) : 이경우는 임폴트해야함. 알트,시프트,o
		// toString은 오버로딩 > 그 데이터타입으로 바꿔서 출력해달라는 것
		// 배열을 출력할 경우 대가로에 감싸져서 출력됨[1, 2, 3, 4, 5]
		System.out.println(str);

		char[] cArr = { 'a', 'b', 'c' };
		System.out.println(cArr); // char은 String과 같은 취급을 받기 때문에 Arrays의 도움을 안받아도 가능

		double[] dArr = { 10.0, 20.0, 30.0 }; // [D@3d646c37

		System.out.println(dArr);
	}

}

//배열 초기화 방법 1 : int[] scores = { 92, 100, 85, 78, 69 };
//배열 초기화 방법 2 : int[] scores = new int[] { 92, 100, 85, 78, 69 };
//배열 초기화 방법 3 : int[] scores;
// scores = new int[] { 92, 100, 85, 78, 69 };
//배열 초기화 방법 4 : int[] scores = new int[5] 
//                 scores[0] = 90
//                 scores[0] = 90
//                 scores[0] = 90
//== 점수가 같다면 반복문 사용 for(int i = 0; i< scpres.lengthl i++){
//                           score[i] = 90;
//                       }

//잘못된 것
//int[]scores;
