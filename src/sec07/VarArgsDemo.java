package sec07;

public class VarArgsDemo {

	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 4));
	}

	// 오버로딩 : 다양한 수의 인자 개수의 메서드를 만듬
	// 인자의 갯수가 가변적일 때 가변개수인수를 사용한다.
	// 몇개가 들어올지는 모르지만 타입은 아는 경우 '데이터 타입 ...'으로 만들면 배열로 적용됨
//	public static int add(int a, int b) {
//		return a+ b;
//	}
//	
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}
//	
//	public static int add(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}

	public static int add(int... number) {
		// 하나의 경우만 가능, (int ...(인수1), float...(인수2)) 이렇게는 못씀
		int sum = 0;
		for (int i : number) {
			sum += i;
		}
		// 몇개가 들어올지 모르지만, 배열로 취급되니까 for-each 사용 가능
		return sum;
	}
}
