package ch02;

public class UpDemo {

	public static void main(String[] args) {
		int j, i = 3;

		// j = i++; // 먼저 i값을 할당하고 +1씩 더해줌
		// j = i;
		// i = i +1;

		j = ++i; // 먼저 i에 +1을 해준고 i를 j에 대입
		// j = i + 1;
		// j = i
		System.out.printf("%d, %d", j, i);

	}

}
