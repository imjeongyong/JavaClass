package recursiveCall;

import java.util.Scanner;

public class q1309 {

	long factorial(int n) {
		long res = 0L;
		if (n == 1) {
			System.out.printf("%d! = %d\n", n, n);
			res = 1;
		} else {
			System.out.printf("%d! = %d * %d!\n", n, n, n - 1);
			res = (long) n * factorial(n - 1);
		}
		return (long) res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		q1309 fac = new q1309();
		System.out.print(fac.factorial(n));

	}
}