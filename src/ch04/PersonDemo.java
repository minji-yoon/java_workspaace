package ch04;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
		/*
		 * p.setAge(21); p.setName("민국"); p.setNationality("대한민국"); p.sayHello();
		 */

		p.setAge(21).setName("민국").setNationality("대한민국").sayHello();
	}

}

class Person {
	private String name;
	private int age;
	private String nationality;

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public Person setName(String name) {
		this.name = name;
		return this;
	} // 연속 호출할 시 나 자신을 반환하라고 해야 가능(그래서 void 대신 자기자신인 Person)

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.println(nationality + "에 사는 " + age + "살 " + name);
	}

	/*
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public void setNationality(String nationality) { this.nationality =
	 * nationality; }
	 * 
	 * public void sayHello() { System.out.println(nationality + "에 사는 " + age +
	 * "살 " + name); }
	 */
}
