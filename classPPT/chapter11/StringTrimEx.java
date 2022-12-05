package chapter11;

public class StringTrimEx { // 문자열의 양 끝의 공백을 없앤다.
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "  45  67    ";

		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
	}
}