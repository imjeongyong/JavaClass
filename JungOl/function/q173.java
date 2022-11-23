package function;

import java.util.Scanner;

public class q173 {

	int cal(int n1, int n2) {
		int res = (n1 * n1) - (n2 * n2);
		return Math.abs(res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		q173 m = new q173();
		System.out.print(m.cal(n1, n2));
	}
}