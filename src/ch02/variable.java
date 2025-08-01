package ch02;

public class variable {

	public static void main(String[] args) {
		int fifteen = 15; // 얘는 기본이니까 안붙여도됨
		long lightSpeed = 300000L; // long은 8바이트인데, int는 4바이트. 그래서 long에 써도됨
		// int 타입이 아니라고 알리기 위해서 L을 붙여주는 것
		double pi = 3.14; // 얘는 기본이니까 안붙여도됨
		float pi2 = 3.14F; // double은 8바이트, float는 4바이트
		// double 타입이 아니라는 것을 표현해 주기 위해서 F붙여줌
		// 이것들을 붙여주지 않으면, int, flat로 인식해서 계산해버린다. > 오류 발생
		System.out.println(fifteen);
		System.err.println(lightSpeed);
		System.err.println(pi2);
	}

}
