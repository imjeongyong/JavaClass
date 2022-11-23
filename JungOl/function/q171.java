package function;

import java.util.Scanner;

public class q171 {

	int sum(int N) {
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		q171 m = new q171();
		System.out.print(m.sum(N));
	}
}