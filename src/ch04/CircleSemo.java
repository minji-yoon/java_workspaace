package ch04;

public class CircleSemo {

	public static void main(String[] args) {
		Circle c = new Circle();

		c.setRadius(10);
		System.out.println("원의 반지름은 " + c.getRadius());
		System.out.println("원의 넓이는 " + c.findArea());

		Circle c1 = new Circle(2);

		System.out.println("원의 반지름은 " + c1.getRadius());
		System.out.println("원의 넓이는 " + c1.findArea());

	}

}

/*
 * class Circle { double radius; //0.0 double findArea() { return 3.14 *
 * this.redius * radius; } }
 */

class Circle {
	// 멤버(필드)
	private double radius;

	// 생성자
	// 디폴트 생성자
	public Circle() {

	}

	public Circle(double r) {
		if (r > 0) {
			;
		}
		{
			this.radius = r;
		}
	} // 초기값을 변경할 수 있는 것 but 숨겨놓은 건데 아무렇게나 값을 변경하면 안되므로 조건을 검

	// Getter
	public double getRadius() {
		return radius;
	}

	// Setter
	public void setRadius(double r) {
		if (r <= 0) {
			System.out.println("원의 반지름은 0보다 커야 합니다.");
			return;
		}
		this.radius = r;

	}

	// 멤버(메서드)
	public double findArea() {
		return 3.14 * this.radius * radius;
	}
}