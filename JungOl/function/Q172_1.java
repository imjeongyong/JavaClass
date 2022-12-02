package function;

import java.util.Scanner;

public class Q172_1 {

	static void makeSquare(int N) {
		for (int i = 1; i <= N; i++) {
			for (int j = 1, k = 1; j <= N; j++, k++) {
				System.out.print(k * i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		makeSquare(inp);
	}
}