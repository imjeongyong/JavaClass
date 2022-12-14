package beginner;

import java.util.Scanner;

public class Q1307 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[][] numAr = new int[n][n];
		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (num == 26) {
					num = 0;
				}
				numAr[i][j] = num++;
//				System.out.print(numAr[i][j] + " ");
			}
//			System.out.println();
		}

		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				System.out.printf("%c ", (char) numAr[j][i] + 65);
			}
			System.out.println();
		}

	}
}