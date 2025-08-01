package ch03;

public class IncrementDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("main에서 increment 호출하기 전 : " + x);

		increment(x); // public static void increment (int n > 여기에 x 값 적용)으로 이동
		System.out.println("main에서 increment 호출하기 후 : " + x); // public static void increment끝난 후 실

	}

	public static void increment(int n) { // reda only > 값을 읽어오기만 한 것
		System.out.println("increment 함수 메서드 시작 할 때 : " + n);
		n++;
		System.out.println("increment 함수 메서드 종료 할 때 : " + n);
	}

}
