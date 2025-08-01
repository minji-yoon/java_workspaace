package sec07;

public class BallArrayDemo {

	public static void main(String[] args) {
		Ball[] arr = new Ball[5]; // arr는 0번째 배열을 가리키고 있음/현재 값은 다 null
//		for (Ball ball : arr) { // arr에있는 ball을 꺼내서 참조변수의 값을 확인
//			System.out.println(ball); // null 5개 출력됨
//	}
		arr[0] = new Ball("빨강");
		arr[1] = new Ball("노랑");// new ball(yellow), new ball(red) 를 만들어서 0번.1번 인덱스에 할당
		for (Ball ball : arr) {
			System.out.println(ball); // 0번 인덱스, 1번 인덱스의 주소값이 출력됨 > sec07.Ball@49097b5d, sec07.Ball@6e2c634b
			// 주소값이 아니라 인덱스의 값을 출력받고 싶다면 아래의 오버라이딩을 해야함
		}

	}

}

class Ball {
	String color;

	public Ball(String color) {
		this.color = color;
	}

//	@Override
//	public String toString() {
//		return color;
//	} // 주소값이 아니라 색이름이 결과값으로 출력되도록함
}