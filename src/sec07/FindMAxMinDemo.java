package sec07;

import java.util.Arrays;

public class FindMAxMinDemo {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 4, 2 };

		int max = arr[0]; // 최대값을 첫번째 값으로 정함
		for (int i = 0; i < arr.length; i++) { // 1번부터 끝가지 비교
			if (max < arr[i]) { // arr의 인덱스에 위치한 값이 max보다 크면
				max = arr[i]; // 그 값을 max에 대입시켜줘
			}
		}
		System.out.println(max);

		int min = arr[0]; // 우선 최소값을 첫번째 값으로 지정해놓음
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); // 정렬코드
		System.out.println(Arrays.toString(arr));
	}

}
