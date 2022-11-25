package function3;

import java.util.Scanner;

public class q589 {

	static int sum(int N) {
		int res = 0;
		if (N == 1) {
			res = 1;
		} else {
			res = N + sum(N - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		System.out.println(q589.sum(N));

	}
}