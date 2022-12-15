package chapter15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // 인터페이스로List로 레퍼런스는 list 선언, 인스턴스는 ArrayList클래스로 구현

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size(); // 전체 아이템 개수
		System.out.println("총 객체수 : " + size);

		String skill = list.get(2); // 2번 인덱스에 들어있는 아이템
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2); // 2번 인덱스 삭제
		list.remove("iBATIS"); // 아이템 이름으로 삭제 가능
		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
}