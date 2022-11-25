package function3;

import java.util.Scanner;

public class q587 {

	static void recursive(int N) {
		if (N == 0) {
			return;
		} else {
			System.out.println("recursive");
			recursive(--N);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		q587.recursive(N);
	}
}