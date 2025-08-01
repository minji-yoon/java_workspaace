package ch03;

public class SwitchDemo {

	public static void main(String[] args) {
//		int number = 2;
//
//		switch (number) {
//		case 3:
//			System.out.println("*"); // (case는 조건에 해당)
//		case 2:
//			System.out.println("**"); // number가 2이니까 case2에 해당
//			// if문의 경우 이것만 찍히고 끝나야하는데, 낙하방식이라 아래의 case1, default까지 찍힘
//			// 그래서 break문이 필요하다.
//		case 1:
//			System.out.println("***");
//		default:
//			System.out.println("*");
//			// 만약 숫자가 4라면 어디에도 해당안되니까 default에 해당된다.
//		}

//		daycheck();

		// Alt Shift M을 입력하면 위의 요일 해주는 코드를 메서드로 만들어줌 > 리팩토링 방법

	}

	private static void daycheck() {
		String day = "으이?"; // 자바는 문자열을 제공
		switch (day) { // 내가 넣은 값을 대입해서 찾음
		case "월":
		case "화":
		case "수":
		case "목":
		case "금":
			System.out.println("평일입니다."); // Sring day에 월~금을 입력하면 이게 출력
			break;
		case "토":
		case "일":
			System.out.println("주말입니다."); // 토~일을 입력하면 출력
			break;
		default:
			System.out.println("올바르지 않은 요일입니다."); // 저 문자열 외에 것을 입력하면 출력
		}

	private static void daycheck() {
		swith (day) {
		case "월", "화", "수", "목", "금" -> System.out.println("평일입니다.");
		case "토", "일" -> System.out.println("주말입니다.");
		default -> System.out.println("올바르지 않은 요일입니다.");
		};
	}

	private static String daycheck(Sting day) {
			String gubun = swith (day) {
			case "월", "화", "수", "목", "금" -> System.out.println("평일입니다.");
			case "토", "일" -> System.out.println("주말입니다.");
			default -> System.out.println("올바르지 않은 요일입니다.");
			};
			return gubun;
	}
}
