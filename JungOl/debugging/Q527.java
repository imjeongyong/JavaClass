package debugging;

import java.util.Scanner;

public class Q527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.print(inp1 / inp2);
		System.out.printf(" %.2f", (double) inp1 / inp2);
	}
}