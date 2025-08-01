package sec07;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println(Circle.numOfCircles);
		// 객체를 만들기 전의 가지고 있는 값을 확인 > 0
		// 아직 만들어지지 않아서 0

		// System.out.println(Circle.numCircles);
		// 아직 객체가 안만들어졌기 때문에 아직 인스턴스 변수의 수는 0

		Circle c1 = new Circle(10.0);
		System.out.println(Circle.numOfCircles);
		// 만들어진 객체의 갯수

		System.out.println(c1.numCircles);
		// 객체가 하나 만들어진 상황이라 인스턴스 1
		// 얘는 자기자신에 대해서 인스턴스 만들었냐 아니냐이므로 0또는 1이다.

		Circle c2 = new Circle(5.0);
		System.out.println(Circle.numOfCircles);

		System.out.println(c2.numCircles);
		// 그러므로 여기도 1 자신이 만들어졌냐 아니냐(안만들어졌으면 0, 만들어지면 1)
	}

}

class Circle {
	// 인스턴스 변수 > static이 안붙으면 다 인스턴스 변수
	double radius;
	int numCircles;

	// 정적(Static, 클래스) 변수
	static int numOfCircles = 0;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfCircles++;
	}
}