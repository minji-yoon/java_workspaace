package ch03;

class RefValue {
	int x; // 클래스 바로 아래의 변수는 자동으로 0으로 초기화
	// 이 x를 사용하기 위해서는 객체를 생성해야함
	// static이 있으면 객체 생성 없이 이를 외부 클래스에서 직접 사용할 수 있음, 얘는 없으므로 따로 객체를 생성해야함 > new
	// 내부클래스에서는 사용할 수 없음
}

public class IncrementDemo2 {

	public static void main(String[] args) {
		RefValue ref = new RefValue(); // RefValue 클래스의 인스턴스를 생성하고, 그 인스턴스를 통해 x와 같은 변수(필드)에 접근할 수 있게 해줌
		// new로 찍어서 새로 만들어낸 것은 인스턴스임
		System.out.println("main에서 increment 호출하기 전 : " + ref.x); // ref의 주소값을 받아서 참조하는 객체의 x 값을 출력함
		ref.x = 10;
		increment(ref); // 객체 자체를 전달
		System.out.println("main에서 increment 호출하기 후 : " + ref.x);
	}

	public static void increment(RefValue ref) { // 객체를 전달받아야 함
		System.out.println("increment 함수 시작 시 : " + ref.x);
		ref.x = 1000; // 객체 내부의 값 변경
		System.out.println("increment 함수 종료 시 : " + ref.x);
	}

}