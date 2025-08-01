package ch04;

public class Test {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.age());
		System.out.println(animal.gender());
	}
}

class Animal {
	public int age() {
		return 0;
	}

	public String gender() {
		return "남자"; // 또는 "여자", 적절한 문자열
	}

	public void isMammal() {
		System.out.println("포유류인지 판단합니다.");
	}

	public void introduce(String[] info) {
		System.out.println("소개합니다.");
	}
}

class Duck extends Animal {
	String beakColor = "yellow"; // 오타: 'brakColor' → 'beakColor'

	public void swim() {
		System.out.println("오리가 헤엄칩니다.");
	}

	public void quack() { // 오타: 'quak' → 'quack'
		System.out.println("꽥꽥!");
	}
}
