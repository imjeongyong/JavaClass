package function;

import java.util.Scanner;

public class q171_1 {

	public int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		q171_1 sum = new q171_1();
		System.out.println(sum.sum(n));
	}
}