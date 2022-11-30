package structure;

import java.util.Scanner;

class son {
	private fam[] fam;
	Scanner sc = new Scanner(System.in);

	son() {
		fam = new fam[2];

		for (int i = 0; i < fam.length; i++) {
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			fam[i] = new fam(height, weight);
		}
	}

	int heiAvg() {
		int res1 = 0;
		for (int i = 0; i < fam.length; i++) {
			res1 += fam[i].getHeight();
		}
		return res1 / 2;
	}

	double weiAvg() {
		double res2 = 0.0;
		for (int i = 0; i < fam.length; i++) {
			res2 += fam[i].getWeight();
		}
		return res2 / 2;
	}

}

class fam {
	private int height;
	private double weight;

	fam(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
}

public class q198 {
	public static void main(String[] args) {
		son s = new son();
		System.out.println("height : " + (s.heiAvg() + 5) + "cm");
		System.out.printf("weight : %.1fkg", (s.weiAvg() - 4.5));
	}
}