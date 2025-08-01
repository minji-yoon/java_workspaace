package sec07;

public class IncrementDemo {

	public static void main(String[] args) {
		int[] x = { 0 }; // 크기가 1인 정수 배열 하나 만들어짐
		System.out.println("메서드 호출 전 x[0] : " + x[0]);
		increment(x);
		System.out.println("메서드 호출 후 x[0] : " + x[0]);
	}

	public static void increment(int[] n) {
		System.out.println("increment 메서드 시작할 때의 n[0] : " + n[0]);
		n[0]++; // n의 [0]의 주소에 있는 값에 1 증가
		System.out.println("increment 메서드 종료 할 때의 n[0] : " + n[0]);
	}

}
