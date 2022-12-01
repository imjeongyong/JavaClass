package function3;

import java.util.Scanner;

public class q592 {

	static int powSum(int N) {
		if (N / 10 == 0) {
			return N * N;
		} else {
			int res = powSum(N / 10) + ((N % 10) * (N % 10));
			return res;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		System.out.println(powSum(inp));
	}
}