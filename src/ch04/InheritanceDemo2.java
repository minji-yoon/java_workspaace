package ch04;

public class InheritanceDemo2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		// animal.fly(); > 자식은 부모의 속성을 가져다 쓸 수 있지만, 부모는 자식의 속성을 가져다쓸 수 없다.
		// 자식이 이후에 어떤 기능을 가질지 모르니까 이를 가져다 쓸 수 없음

		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run(); // 추가 기능
		tiger.move(); // 오버라이딩된 move(): "뜁니다." 출력

		Bird bird = new Bird();
		bird.eat();
		bird.move(); // 오버라이딩된 move(): "납니다." 출력
		// bird.fly(); 를 호출하지 않았지만, 가능함
	}
}

class Animal {
	// 모든 동물을 주둥이를 가진다.
	String mouth;

	// eat
	void eat() {
		System.out.println("먹습니다.");
	}

	// move
	void move() {
		System.out.println("움직입니다.");
	}
	// 이 특징은 아래 class도 동일 > 이걸 다 똑같이 써주면 효율성 떨어짐. 그래서 상속을 통해 쓰지 않아도 그대로 사용할 수 있게 함
}

class Tiger extends Animal { // extends : 상속
	// move
	@Override
	void move() {
		System.out.println("뜁니다.");
	}
	// 🔁 move() 오버라이딩: Tiger만의 이동 방식 정의

	// run
	void run() {
		System.out.println("뜁니다.");
	}
	// ⚠️ run()과 move()가 동일한 동작을 함 → 의미 중복 있음
	// ➤ 둘 중 하나만 써도 되며, 필요하다면 run() 안에서 move() 호출 가능
}

class Fish extends Animal {
	// move
	@Override
	void move() {
		System.out.println("헤엄칩니다.");
	}

	void swim() {
		System.out.println("헤엄칩니다.");
	}
	// ⚠️ move()와 swim()이 동일한 동작을 함 → 의미 중복 있음
	// ➤ 굳이 나눌 이유가 없다면 swim()만 사용하거나 move()만 유지
}

class Bird extends Animal {
	// move
	@Override
	void move() {
		System.out.println("납니다.");
	}

	// fly
	void fly() {
		System.out.println("납니다.");
	}
	// ⚠️ move()와 fly()가 동일한 동작을 함 → 중복
	// ➤ fly()는 구체적인 이름이라 유지할 수 있지만, move()만으로도 충분함
}
