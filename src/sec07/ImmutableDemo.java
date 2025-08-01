package sec07;

public class ImmutableDemo {

	public static void main(String[] args) {
		/*
		 * String str1 = new String("Hello");
		 * 
		 * String str2 = new String("Hello");
		 */

		String str1 = "Hello";

		String str2 = "Hello";

		System.out.println(str1 == str2); // true

		String str3 = new String("Hello");
		String str4 = new String("Hello"); // 서로 다른 위치의 주소에 각각 만들어짐(String Pool 이전)
		System.out.println(str3 == str4); // false

		str2 = "World";
		System.out.println(str1 + " : " + str2); // Hello : World
		System.out.println(str1 == str2); // false >1은 옛날 주소를 가지고, 2는 새로 할당받은 곳의 주소를 가지고 있음
		System.out.println(str3.equals(str4));// 값이 서로 가지고 있는 값이 같아?> String 은 값을 비교할 때 동등비교를 해야한다. But 두개가 같은 객체는 아니다.

		// str1에 할당된 값은 바꾸지않으면 계속 유지되고(그대로 두고), 2는 새로운 객체를 만들고(World) 그것을 가리키게 하는 것
		// 불변객체니까 해당 값을 변경하지 않고, 다른 것을 만들어서 쓰도록 함

	}

}
