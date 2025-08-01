package sec07;

import java.util.Scanner;

/*public class DiceDemo {

	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll();

	}

}

class Dice {
	public void roll() {
		int result = 0;
		for (int i = 0; i < 3; i++) {
			result = (int) (Math.random() * 6) + 1;
			System.out.println("결과 : " + result);
		}
	}
}



public class DiceDemo {

	public static void main(String[] args) {
		Dice dice = new Dice();
		for (int i = 0; i < 3; i++) {
			dice.roll();
		}
	}

}

class Dice {
	public void roll() {
		int result = (int) (Math.random() * 6) + 1;
		System.out.println("결과 : " + result);
	}
}*/

public class DiceDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("반복수행할 횟수를 입력하세요? : ");
		int count = in.nextInt();
		Dice dice = new Dice();
		for (int i = 0; i < count; i++) {
			dice.roll();
		}

	}

}

class Dice {
	public void roll() {
		int result = (int) (Math.random() * 6) + 1;
		System.out.println("결과 : " + result);
	}
}
