
package sec07;

public class StringDemo5 {
	public static void main(String[] args) {
//		String.formatStr = String.format("%s %d", "JDK", 14);
//		System.out.println(formatStr);
//
//		String.joinstr = String.join(",", "apple", "banana", "cherry", "durian");
//		System.out.println(joinstr);

		// 문자열을 숫자로 바꿀 때
//		Inreger.parseInt(joinStr)
//		Long.parseLong(joinStr)
//		Double.parseDouble(joinStr)

		// 숫자를 문자열로 변경 valueOf()
		String v1 = String.valueOf(false);
		String v2 = String.valueOf(10);
		String v3 = String.valueOf(3.14);

		System.out.println(v1 + v2 + v3);

		// 텍스트블록
		// 업데이트 이전
		String html = "<html>\n" + "	<body>\n" + "	</body>\n" + "</html>";
		System.out.println(html);

		// 업데이트 이후
		String html2 = """
				<html>
					<body>
					</body>
				</html>
				""";
		System.out.println(html2);
	}
}
