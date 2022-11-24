package recursiveCall;

import java.util.Scanner;

public class q1169_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		q1169_1.dice1(N);

	}

	static void dice1(int N) {
		int a = 1;
		int b = 1;
		int c = 1;

		System.out.println(a + " " + b + " " + c);
	}
}