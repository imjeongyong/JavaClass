package chapter15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "홍길동"), 95); // 키가 객체, 벨류는 정수값
		map.put(new Student(1, "홍길동"), 95);

		System.out.println("총 Entry 수 : " + map.size());
	}
}