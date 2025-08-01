package ch03;

public class Method1Demo {

	public static void main(String[] args) {
		// int sum = 0;
		// for(int i=0; i<=10; i++) {
		// sum = sum + i
		// }
		// System.out.println("100부터 1000까지 합은" + sum);
		System.out.println("1부터 10까지 합은" + sum(1, 10));

		// sum = 0; //sum 초기화
		// for(int i=10; i<=100; i++) {
		// sum = sum + i
		// }
		// System.out.println("100부터 1000까지 합은" + sum);
		System.out.println("10부터 100까지 합은" + sum(10, 100));

		// sum = 0; // 매서드 안에서만 영향을 미치는 지역변수
		// for(int i=100; i<=1000; i++) {
		// sum = sum + i
		// }
		// System.out.println("100부터 1000까지 합은" + sum);
		System.out.println("100부터 1000까지 합은" + sum(100, 1000));
	}

	// 위의 반복되는 메서드를 중복제거하고자 함
	public static int sum(int start, int stop) { // int 값을 반환받는 메서드를 만들겠다는 것/ 정수 start, stop 라는 매개변수를 받음)
		// start, stop 도 지역변수
		int sum = 0; // 매서드 안에서만 영향을 미치는 지역변수
		for (int i = start; i <= stop; i++) {
			sum = sum + i;// 자바에서는 변수와 메서드 이름이 같아도 됨
		}
		return sum;// 반환받겠다고 했으니까 return을 입력해줘야함
		// 유지보수성이 높아짐, 이걸 가져다쓰기때문에 문제가 생기면 이 코드 한번만 고치면됨, 원래는 각각의 메서드를 다 수정해야함
		// static에서는 static만 호출할 수 있다.
	}

}
