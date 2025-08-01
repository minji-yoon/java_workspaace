package ch04;
//다형성 해석

public class InheritanceDemo {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		// animal.fly(); >자식은 부모의 속성을 가져다 쓸 수 있지만, 부모는 자식의 속성을 가져다쓸 수 없다.
		// 자식이 이후에 어떤 기능을 가질지 모르니까 이를 가져다 쓸 수 없음
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		Bird bird = new Bird();
		bird.eat();
		bird.fly();
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
	// 이 특징은 아래 class도 동일 > 이걸 다 똑같이 써주면 효율성 떨어짐. 그래서 상속을 통해 쓰지않아도 그대로 사용할 수 있게함
}

class Tiger extends Animal { // extends : 상속
	// run
	void run() {
		System.out.println("뜁니다.");
	}
}

class Fish extends Animal {
	void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("납니다.");
	}
}