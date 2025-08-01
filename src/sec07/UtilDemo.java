package sec07;

public class UtilDemo {

	public static void main(String[] args) {
		int result = Util.fourTimes(4);
		System.out.println(result);
		// 다 스태틱변수로 객체를 만들필요가 없음
		// 그래서 못만들게 하려고 아예 프라이빗으로 숨겨버림
	}

}

class Util {
	static int fourTimes(int i) {
		return 4 * 1;
	}

	private Util() {
		// 프라이빗으로 유틸을 숨겨버림
	}
}