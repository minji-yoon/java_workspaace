package sec07;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		// 객체타입을 <?>에 입력할 수 있는데, 기본타입(int)를 쓰면 안되고, Integer식으로 변형해서 써줘야함
		// 뒤에<>는 앞의 타입과 똑같이 하려면 생략해도됨

		System.out.println(arrayList.size()); // 0
		System.out.println(arrayList); // []

		arrayList.add(10);
		System.out.println(arrayList.size()); // 1
		System.out.println(arrayList); // [10]

		arrayList.add(20);
		System.out.println(arrayList.size()); // 2
		System.out.println(arrayList); // [10, 20]

	}

}
