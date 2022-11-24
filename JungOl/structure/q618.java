package structure;

import java.util.Scanner;

class StuList {
	Scanner sc = new Scanner(System.in);
	Student[] stu = new Student[5];

	StuList() {
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			stu[i] = new Student(name, height, weight);
		}
	}

	void printStu() {
		for (int i = 0; i < stu.length; i++) {
			System.out.printf("%s %d %.1f\n", stu[i].getName(), stu[i].getHeight(), stu[i].getWeight());
		}

	}

	void nameSort() {
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length - 1; j++) {
				if ((int) stu[j].getName().charAt(0) > (int) stu[j + 1].getName().charAt(0)) {
					Student tmpStu = new Student(stu[j].getName(), stu[j].getHeight(), stu[j].getWeight());
					stu[j] = stu[j + 1];
					stu[j + 1] = tmpStu;
				}
			}
		}

	}

	void weightSort() {
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length - 1; j++) {
				if (stu[j].getWeight() < stu[j + 1].getWeight()) {
					Student tmpStu = new Student(stu[j].getName(), stu[j].getHeight(), stu[j].getWeight());
					stu[j] = stu[j + 1];
					stu[j + 1] = tmpStu;
				}
			}
		}
	}

}

class Student {
	private String name;
	private int height;
	private double weight;

	Student(String name, int height, double weight) {
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

public class q618 {
	public static void main(String[] args) {
		StuList stl = new StuList();
		System.out.println("name");
		stl.nameSort();
		stl.printStu();
		System.out.println();
		
		stl.weightSort();
		System.out.println("weight");
		stl.printStu();
	}
}