package ch04;

public class RefTypeDemo {

	public static void main(String[] args) {
		int i = 10;
		Ball myBall = new Ball(); // new Ball의 주소를 myBall이라는 변수에 할당 > ch04.Ball@49097b5d
		Ball yourBall = new Ball(); // new Ball의 주소를 yourBall이라는 변수에 할당 > ch04.Ball@6e2c634b

		System.out.println(myBall); // ch04.Ball@49097b5d
		System.out.println(yourBall); // ch04.Ball@6e2c634b
		System.out.println(myBall == yourBall); // false(동등하지만, 동일하지는 않음)

		myBall = yourBall; // yourBall의 주소를 myBall에 적용 > 주소가 똑같아짐
		// 원래 myBall이 가르키던 객체는 어떻게 되는가? > 아무도 가리키지 않는 것은 JVM의 가비지컬렉터가 자동으로 수거(메모리 관리)

		System.out.println(myBall); // ch04.Ball@6e2c634b
		System.out.println(yourBall); // ch04.Ball@6e2c634b
		System.out.println(myBall == yourBall); // true(동등하고, 동일함)

	}

}

class Ball {

}