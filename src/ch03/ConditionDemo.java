package ch03;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		int x = 10;
		if (x >= 10 && x > 0) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} // if(조건식){실행문} > 조건식이 참일 때 {}안의 명령어를 실행

		String str = "Yes";
		if (str.equals("Yes")) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} // String의 경우 그냥 단순비교(str=="Yes")로 같냐 다르냐로 물어보면 안됨, equals를 해주는게 정석적인 방법(스트링풀을
			// 가져와서 보기때문에 실행되기는 하는데, 원래는 안됨)
			// IgnoreCase : 대소문자 구분하지 않음

		Scanner in = new Scanner(System.in); // system.in키보드를 통해 값을 받겠다는 것
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();

		// if(num % 2 == 0) {
		// System.out.println("짝수입니다.");
		// }

		// if(num % 2 == 1) {
		// System.out.println("홀수입니다.");

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println("종료!");
	}

}
