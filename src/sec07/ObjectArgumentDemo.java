package sec07;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.radius);

		zero(c2.radius);
		System.out.println("원(c2)의 반지름 : " + c2.radius);
	}

	// 오버로딩
	static void zero(Circle c) {
		c.radius = 0.0;

	}// 매개변수 타입은 Circle , 주소값을 가서 변경(read & write)

	static void zero(double r) {
		r = 0.0; // only read
	}
}
