package sec07;

public class Ex_02 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4)); // 10
		int[] arr = { 2, 3 };
		System.out.println(sum(1, arr)); // 6
		System.out.println(sum(1, 2, 3, 4, 5)); // 15
	}

	public static int sum(int number, int... numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}
