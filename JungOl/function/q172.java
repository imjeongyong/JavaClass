package function;

import java.util.Scanner;

public class q172 {

	void makeSq(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				int num = i * j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		q172 m = new q172();
		m.makeSq(N);
	}
}