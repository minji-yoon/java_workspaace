package ch05;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "Hello, World!";

		System.out.println(str);

		System.out.println(str.toUpperCase()); // 전체를 다 대문자로 바궈서 보여줘라
		System.out.println(str.toLowerCase()); // 전체를 다 소문자로 바꿔서 보여줘라

		System.out.println(str); // 여전히 값자체는 변하지 않음

		str = str.toUpperCase(); // 대문자로 구성된 새로운 객체를 만들어서 그 주소를 할당함
		// 이전의 "Hello, World!"는 아무도 가리키지 않으므로 이후 가비지 컬렉터가 수거해감

		System.out.println(str); // 값이 변해서 나옴

		System.out.println(str.substring(0, 5)); // 인덱스를 기준으로 0-5인덱스까지 보여줘라
		System.out.println(str.substring(5)); // 5까지 삭제해줘
	}

}
