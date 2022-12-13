package beginner;

import java.util.Scanner;

public class Q1856 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int sq = 1;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0 && i != 1) {
				sq = sq + m + 1;
				for (int j = 1; j <= m; j++) {
					System.out.print(sq++ + " ");
				}
			} else if (i % 2 == 0) {
				sq = sq + m - 1;
				for (int j = m; j >= 1; j--) {
					System.out.print(sq-- + " ");
				}
			} else {
				for (int j = 1; j <= m; j++) {
					System.out.print(sq++ + " ");
				}
			}
			System.out.println();
		}
	}
}