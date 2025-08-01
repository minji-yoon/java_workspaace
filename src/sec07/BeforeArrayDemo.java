package sec07;

public class BeforeArrayDemo {

	public static void main(String[] args) {
		// 배열의 필요성
		// Scanner을 통해서 값을 받았다고 전제
		int score1 = 90;
		int score2 = 100;
		int score3 = 80;
		int score4 = 70;
		int score5 = 60;

		int sum = score1 + score2 + score3 + score4 + score5;
		System.out.println("학생 5명의 점수의 합은 : " + sum);
//		System.out.println("학생 5명의 점수의 평균은 : " + sum/5); //오류 발생 > sum은 int이기 때문에 실수로 나오면 실수를 나타내지 못함
		System.out.println("학생 5명의 점수의 평균은 : " + sum / (double) 5); // double로 강제 형변환

		// but 점수를 추가해야하는 상황에서는 하나하나 수정하고, 코드를 수정해야함
		// 이를 해결하기 위해서 배열이 필요함
	}

}
