
package sec06;

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.info();
		Circle c2 = new Circle(10.0);
		c2.info();
		Circle c3 = new Circle("빨강");
		c3.info();
		Circle c4 = new Circle(10.0, "파랑");
		c4.info();

	}

}

class Circle {
	double radius;
	String color;

	// 기본생성자. 디폴트생성자 : 기본값을 부여할 수 있음 //아무값도 주지 않았을 때 부여
	public Circle() {
		this(1.0, "노랑");
	}
	// 나를 가르키는, 내 생성자 가르킬 때 this

	public Circle(double radius) {
		// this.radius = radius;
		this(radius, "노랑");
	}

	public Circle(String color) {
		// this.color = color;
		this(1.0, color);
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void info() {
		System.out.printf("원의 반지름은 %.1f이고 색깔은 %s 입니다.\n", radius, color);
	}
}
