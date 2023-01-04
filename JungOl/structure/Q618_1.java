package structure;

import java.util.Scanner;

class OrderBy {
	Scanner sc = new Scanner(System.in);
	StudentList[] sl = new StudentList[5];

	OrderBy() {
		for (int i = 0; i < sl.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			sl[i] = new StudentList(name, height, weight);
		}
	}

	void name() {
		System.out.println("name");
		for (int i = 0; i < sl.length; i++) {
			for (int j = 0; j < sl.length - 1; j++) {
				if (sl[j].getName().compareTo(sl[j + 1].getName()) > 0) {
					StudentList sltmp = sl[j];
					sl[j] = sl[j + 1];
					sl[j + 1] = sltmp;
				}
			}
		}
	}

	void weight() {
		System.out.println("weight");
		for (int i = 0; i < sl.length; i++) {
			for (int j = 0; j < sl.length - 1; j++) {
				if (sl[j].getWeight() < sl[j + 1].getWeight()) {
					StudentList sltmp = sl[j];
					sl[j] = sl[j + 1];
					sl[j + 1] = sltmp;
				}
			}
		}
	}

	void print() {
		for (int i = 0; i < sl.length; i++) {
			System.out.printf("%s %d %.1f\n", sl[i].getName(), sl[i].getHeight(), sl[i].getWeight());
		}
	}
}

class StudentList {
	private String name;
	private int height;
	private double weight;

	StudentList(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}

public class Q618_1 {
	public static void main(String[] args) {
		OrderBy order = new OrderBy();
		order.name();
		order.print();
		System.out.println();
		
		order.weight();
		order.print();
	}
}