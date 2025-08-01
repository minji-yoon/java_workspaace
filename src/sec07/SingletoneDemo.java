package sec07;

public class SingletoneDemo {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); //가져다 쓸 수 없음 프라이빗
		Singleton s1 = Singleton.getInstance(); // 딱 한번만 만들고 그 주소값을 반환해서 쓰도록 해줌
		Singleton s2 = Singleton.getInstance(); // 그래서 s1.2.3.의 주소값은 모두 같다.
		Singleton s3 = Singleton.getInstance();
		// 상속받은 object에 있는 toString()에 정의된 바에 의해서 이름@1111가
		// 출련된다.(sec07.Singleton@49097b5d)

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1 == s3 && s2 == s3); // true
	}

}

class Singleton {
	// static 변수, 은닉
	private static Singleton singleton = new Singleton();
	// 메서드 영역에는 들어가지만, 힙영역에 하나 만들어짐
	// 스택영역이 아니라 메서드 영역에 있는 것이 힙영역의 싱글톤을 가르킴

	// 생성자 > 숨겨둔 것나는 나를 가져다쓸 수 있음
	private Singleton() {

	}

	// static 메서드 > 외부에서 가져다 쓰고싶을 때 싱글톤이라는 메서드를 반환하도록 해주는 것
	public static Singleton getInstance() {
		return singleton;// 싱글톤이라는 참조변수가 가진 주소값을 리턴해줌
	}
}