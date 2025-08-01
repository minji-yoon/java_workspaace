package ch04;

public class LocalVarDemo {

	public static void main(String[] args) {
		int a = 0;
		double b; // 초기값이 할당되지 않음
		// System.out.println(b); // 에러 발생 The local variable b may not have been
		// initialized
		// System.out.println(a + c); // c cannot be resolved to a variable
		int c = 0;
		for (int e = 0; e < 10; e++) {
			int a1 = 1;
			System.out.println(e);
		}
	}

}
