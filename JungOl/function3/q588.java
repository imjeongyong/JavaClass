package function3;

import java.util.Scanner;

public class q588 {
	static void countDown(int N) {
		if (N == 0) {
			return;
		} else {
			System.out.print(N + " ");
			countDown(--N);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		q588.countDown(N);
	}
}