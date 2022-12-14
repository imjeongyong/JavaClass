package beginner;

import java.util.Scanner;

public class Q2046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		switch (m) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					for (int j = 1; j <= n; j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				} else {
					for (int j = n; j >= 1; j--) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
			}
			break;
		case 3:
			for (int i = 1; i <= n; i++) {
				int num = i;
				for (int j = 1; j <= n; j++) {
					System.out.print(num + " ");
					num += i;
				}
				System.out.println();
			}
			break;
		}
	}
}