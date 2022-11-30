package function;

import java.util.Scanner;

public class q171_2 {

	public int sum(int n) {
		int res = 0;
		if (n == 1) {
			res = res + 1;
		} else {
			res = n + sum(n - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		q171_2 m = new q171_2();
		System.out.println(m.sum(inp));
	}
}