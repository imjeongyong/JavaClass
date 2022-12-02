package operator;

import java.util.Scanner;

public class Q111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] report = new int[4];
		int sum = 0;
		for (int i = 0; i < report.length; i++) {
			report[i] = sc.nextInt();
			sum += report[i];
		}
		sc.close();
		System.out.println("sum " + sum);
		System.out.println("avg " + sum / report.length);
	}
}