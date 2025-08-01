package sec07;

public class MutableDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비");
		Cat c2 = c1; // 값이 복사된게 아니라 주소를 공유하는 것

		System.out.println(c1 + " : " + c2);
		System.out.println(c1.getName()); // 나비
		System.out.println(c2.getName()); // 나비

		// c2.setName("야옹이"); > 이제 이렇게 바꿀 수 없음(불변객체로 설정했기 때문에)
		// System.out.println(c1.getName()); // 야옹이
		// System.out.println(c2.getName()); // 야옹이

		c2 = new Cat("야옹이");
		System.out.println(c1.getName()); // 나비 > 원래 주소를 공유하던 애는 원래대로 계속 가리키고 있고
		System.out.println(c2.getName()); // 야옹이 > 얘는 새로운 객체를 만들어서 그것을 가리키도록 되었다.

	}

}

class Cat { // 원래는 가변객체(mutable)였는데, 불변객체(immutable)로 만듬
	private final String name; // final을 붙여서 값이 변경되지 않도록 만듬/생성자를 통해서만 바꿀 수 있음

	// 생성자
	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// public void setName(String name) { //set을 없애서 변경할 수 있는 방법을 없앴음
	// return this = name;
	// }
}