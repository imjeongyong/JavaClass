package starPrint;

import java.util.Scanner;

public class q2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int k = (2 * N) - 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			k -= 2;
			System.out.println();
		}
		int l = 3;
		for (int i = 0; i < N - 1; i++) {
			for (int j = (N - i) - 2; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < l; j++) {
				System.out.print("*");
			}
			l += 2;
			System.out.println();
		}
	}
}