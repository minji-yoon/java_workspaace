package ch01;

public class Hello {
	/**
	 * 메서드, 또는 자체에 주석을 다는 것이다. Hello 프로그램의 기본 메서드
	 * 
	 * @param args 문자 배열을 넘겨준다.
	 */
	public static void main(String[] args) {
		/*
		 * static > 객체를 안 만들어도 실행 가능 void > 리턴값이 없을 경우 변수타입을 설정하지 않을 때 만약 변수값이 있다면 int,
		 * float 등등 지정해주고, return 해야함
		 */

		// 나의 첫 번째 프로그램(단축키) > sysout 입력 후 ctl+스페이스바 > 자동 입력
		System.out.println("Hello, World!/*여기다 입력해도 주석처리 되지 않음, 출력값으로 인식*/"); // 여기도 주석 추가
		System.out.println("Hello, World!");
		/*
		 * 
		 * 단순 여러 줄 주석
		 * 
		 */

		// 나의 두 번째 프로그램 > 변수 선언 및 실행
		int x; // 변수 선언(자바는 변수 타입 반드시 선언해줘야함)/지역변수 // 실제 값이 없어서 메모리를 4바이트 확보하기는 했으나, 메모리(주소값)를
				// 할당하지는 않음
		x = 1; // 변수의 값을 초기화 > 초기값 설정 //이때 가야 실제 메모리가 할당된다.
		int y = 2; // 선언과 동시에 초기화(노란 전구, 줄은 벼수가 선언되었는데 사용되지는 않았다는 것)
		int result = x + y;
		System.out.println(result);
		// return을 생략해도 컴파일러가 알아서 넣어줌(void) > 리턴하면서 메서드 종료

		// 나의 세 번째 프로그램
		System.out.println("안녕!");
		System.out.println("hello," + " world!");
		String str = "hello";// int는 기본 타입으로 소문자로 쓰고, String은 클래스 타입으로 첫글자 대문자여야함
		System.out.println(str);
		// return

		// int x = 1; // (기본형 변수(실제 값을 저장))
		// int r = x; // (참조형 변수(메모리 주소 저장>주소를 찾아서 실제 값을 찾음))
	}

}
