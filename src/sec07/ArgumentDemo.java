package sec07;

public class ArgumentDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		int count = Integer.parseInt(args[1]);

		// 두 번째 인자의 횟수만큼 첫 번째 인자를 콘솔에 출력하도록 프로그램을 짜기
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

	public static void increments(String[] args) {

	}

}