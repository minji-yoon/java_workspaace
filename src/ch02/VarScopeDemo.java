package ch02;

public class VarScopeDemo {

	public static void main(String[] args) {
		int var1 = 10; // 메인 블록 전체에 영향을 미치는 변수 : main 메서드 블록, if 블록, for 블록 모두에서 사용 가능)

		if (true) {
			int var2 = 20; // var 2는 if문에서만 사용 가능
			System.out.println("if ==>" + var1); // if문 앞에서만 뽑을 거야
			System.out.println("if ==> var2" + var2);
		}

		for (int i = 0; i < 2; i++) {
			int var3 = 30; // var3는 for문에서만 사용 가능하다
			System.out.println("for ==>" + var1);
			// System.out.println("if ==> var2" + var2); //에러 발생(선언되지 않았다고 오류 발생)
			System.out.println("if ==> var3" + var3); // for문의 var3를 사용
		}
		System.out.println("main ==>" + var1);
		// System.out.println("if ==> var2" + var2);
		// System.out.println("if ==> var3" + var3);
	}

}
