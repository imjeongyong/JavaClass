package recursiveCall;

import java.util.Scanner;

public class Q592 {

	int powSum(int N) {
		int res = 0;
		if (N / 10 == 0) {
			res = N * N;
		} else {
			res = powSum(N / 10) + ((N % 10) * (N % 10));
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		Q592 m = new Q592();
		System.out.println(m.powSum(N));
	}
}