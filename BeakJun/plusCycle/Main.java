package plusCycle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int inp = N;
		int n1 = 0;
		int n2 = 0;
		int counter = 0;
		while (true) {
			n1 = (inp / 10) + (inp % 10);
			n2 = (inp % 10) * 10 + (n1 % 10);
			counter++;
			if (n2 == N) {
				break;
			}
			inp = n2;
		}
		System.out.println(counter);
	}
}