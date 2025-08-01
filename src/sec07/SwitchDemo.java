package sec07;

public class SwitchDemo {

	public static void main(String[] args) {
		NewGender gender = NewGender.여성;

		String s = switch (gender) {
		case 남성 -> "은 병역 의무가 있다.";
		case 여성 -> "은 병역 의무가 없다.";
		default -> "*";
		};
		System.out.println(gender + s);
	}

}

enum NewGender {
	남성, 여성 // 힙영역에 이런 객체가 하나씩 만들어진 상태이다.
}