package debugging;

import java.util.Scanner;

public class Q526 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextDouble();
		double inp2 = sc.nextDouble();
		sc.close();

		double res1 = inp1 * inp2;
		int res2 = (int) inp1 * (int) inp2;

		System.out.print((int) res1 + " " + res2);
	}
}