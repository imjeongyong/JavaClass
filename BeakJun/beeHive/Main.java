package beeHive;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int i = 0;
		int hive = 1;
		while (true) {
			i++;
			hive = hive + 6 * i;

			if (N == 1) {
				System.out.println(i);
				break;
			} else if (N > hive - (6 * i) && N <= hive) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}