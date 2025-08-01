package ch03;

public class MyMathDemo {

	public static void main(String[] args) {
		MyMath math = new MyMath(); // MyMath 클래스를 참조해서 계산기 객체 생성
		System.out.println(math.add(2, 3)); // math.입력시 사용가능한 메서드가 뜸. 세모가 내가 만든 것이고, 동그라미는 부모로부터 상속받은 메서드
		System.out.println(math.sub(2, 3));
		System.out.println(math.mult(2, 3));
		System.out.println(math.div(2, 0));
	}

}
