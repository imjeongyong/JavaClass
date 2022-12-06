package function;

import java.util.Scanner;

public class Q173_1 {

	static int calc(int a, int b) {
		int max = (Math.max(a, b)) * (Math.max(a, b));
		int min = (Math.min(a, b)) * (Math.min(a, b));
		int res = max - min;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println(calc(n1, n2));
	}
}