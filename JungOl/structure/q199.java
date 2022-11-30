package structure;

import java.util.Scanner;

class sort {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	private score[] scores;

	sort() {
		scores = new score[n];
		for (int i = 0; i < scores.length; i++) {
			String name = sc.next();
			int sco1 = sc.nextInt();
			int sco2 = sc.nextInt();
			int sco3 = sc.nextInt();

			scores[i] = new score(name, sco1, sco2, sco3);
		}
	}

	void sortSum() {
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length - 1; j++) {
				if (scores[j].getScoSum() < scores[j + 1].getScoSum()) {
					score tmp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = tmp;
				}
			}
		}
	}

	void print() {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s %d %d %d %d\n", scores[i].getName(), scores[i].getSco1(), scores[i].getSco2(),
					scores[i].getSco3(), scores[i].getScoSum());
		}
	}
}

class score {
	private String name;
	private int sco1;
	private int sco2;
	private int sco3;
	private int scoSum;

	score(String name, int sco1, int sco2, int sco3) {
		this.name = name;
		this.sco1 = sco1;
		this.sco2 = sco2;
		this.sco3 = sco3;
		this.scoSum = sco1 + sco2 + sco3;
	}

	public String getName() {
		return name;
	}

	public int getSco1() {
		return sco1;
	}

	public int getSco2() {
		return sco2;
	}

	public int getSco3() {
		return sco3;
	}

	public int getScoSum() {
		return scoSum;
	}
}

public class q199 {
	public static void main(String[] args) {
		sort m = new sort();
		m.sortSum();
		m.print();
	}
}