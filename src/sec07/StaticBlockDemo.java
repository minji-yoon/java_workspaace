package sec07;

public class StaticBlockDemo {
	// 정적(static, 클래스)
	// 정적변수를 불러다 쓰는 것은 정적메서드에서는 가능
	// 인스턴스는 아직 만들어지지 않았기 때문에 가져다 쓸 수 없음
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		sumOneToTen = sum;
		// sum을 이용할 수 없음. > 이 블록이 끝나면 사라지는 지역변수
	}
	int any = 0;
	// 아직 객체가 안만들어진 상태이기 때문에 static에서 이 인스턴스 변수를사용할 수 없음

	// 정적 메서드
	public static void main(String[] args) {
		System.out.println(sumOneToTen); // 클래스 메서드에서는 클래스 변수를 사용할 수 있음
		// System.out.println(any); // 클래스 메서드에서 인스턴스 변수를 사용할 수 없음
		// System.out.println(sum); // 클래스 메서드에서 지역 변수를 사용할 수 없음
	}

}
