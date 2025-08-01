package sec07;

public class String3Demo {

	public static void main(String[] args) {
		int i = 7;
		System.out.println("java" + i);
		System.out.println("java" + 7);

		String s1 = new String("Hi");
		String s2 = new String("Java");

		System.out.println("문자열의 길이(s1) : " + s1.length());
		System.out.println(s1.charAt(1));

		s1 = s1.concat(s2); // 문자열을 더해주는것

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!");
		System.out.println(s1.substring(4, 8) + "!");

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank()); // 빈칸이야?
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-*";
		System.out.println(s5.repeat(10));

		System.out.println(s2.trim().indexOf("v")); // trim 빈칸을 없애거나 잘라내라

	}

}
