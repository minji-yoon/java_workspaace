package ch04;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone(); // > 여기서 new로 새로 만들어진 게 인스턴스 > 인스턴스의 주소를 myPhone에 할당
		myPhone.model = "갤럭시 S25"; // 참조클래스의 변수/메서드를 갖져와서 인스턴스에 값을 생성
		myPhone.value = 200;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone";
		yourPhone.value = 250;
		yourPhone.print();
	}

}

class Phone {
	String model;
	int value;

	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰입니다.");
	}
}
