package beginner;

import java.util.Scanner;

public class Q1303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int sq = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(sq++ + " ");
			}
			System.out.println();
		}
	}
}