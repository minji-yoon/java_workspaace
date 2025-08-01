package ch05;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "J";
		String s2 = "C";

		String s3 = new String("J");
		String s4 = "j";

		System.out.println("s1 == s3 : " + (s1 == s3)); // 동일 객체인지 물어보는 것 : 주소값이 다름 > s3를 새로만들었기 때문
		System.out.println("s1.equals(s3) : " + (s1.equals(s3))); // 값이 동등한 것인지 : 값은 둘다 "J"로 같다.
		System.out.println("s3.equalsIgnoreCase(s4) : " + (s3.equalsIgnoreCase(s4))); // 값이 같냐는 건데, 대소문자 구문안해서 똑같음
		System.out.println("s1.compareTo(s2) : " + (s1.compareTo(s2))); // 7 크기비교 +앞에가 큰거, -뒤에가 큰거 (사전상 누가 앞인가를 구분함)
		System.out.println("s2.compareTo(s1) : " + (s2.compareTo(s1))); // -7
		System.out.println("s1.compareToIgnoreCase(s4) : " + s1.compareToIgnoreCase(s4)); // 0:같다
	}

}
