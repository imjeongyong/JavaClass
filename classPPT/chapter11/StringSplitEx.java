package chapter11;

public class StringSplitEx {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-Simon";

		String[] names = text.split("&|,|-");
		for (String name : names) {
			System.out.println(name);
		}
	}
}