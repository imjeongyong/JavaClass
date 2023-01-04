package chapter15;

public class Person implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person arg0) { // 정렬 기준!
		if (age < arg0.age) { // 파라메터로 들어온 객체와 멤버변수를 비교
			return -1;
		} else if (age == arg0.age) {
			return 0;
		} else {
			return 1;
		}
	}
}