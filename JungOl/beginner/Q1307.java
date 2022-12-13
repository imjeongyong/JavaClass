package beginner;

import java.util.Scanner;

public class Q1307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[][] numAr = new int[n][n];

		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numAr[i][j] = num++;
				System.out.print(numAr[i][j] + " ");
			}
			System.out.println();
		}

	}
}