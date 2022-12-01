package structure;

import java.util.Scanner;

class ShortMan {
	Person[] l;
	Scanner sc = new Scanner(System.in);

	ShortMan() {
		l = new Person[5];

		for (int i = 0; i < l.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			l[i] = new Person(name, height);
//			System.out.println(l[i].getName() + " " + l[i].getHeight());
		}
	}

	void findShortest() {
		Person shortMan = new Person("", 300);
		for (int i = 0; i < l.length; i++) {
			if (shortMan.getHeight() > l[i].getHeight()) {
				shortMan = l[i];
			}
		}
		System.out.println(shortMan.getName() + " " + shortMan.getHeight());
	}
}

class Person {
	private String name;
	private int height;

	Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}
}

public class Q617 {
	public static void main(String[] args) {
		ShortMan sm = new ShortMan();
		sm.findShortest();
	}
}