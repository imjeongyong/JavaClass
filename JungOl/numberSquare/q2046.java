package numberSquare;

import java.util.Scanner;

public class q2046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		switch (m) {

		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;

		case 2:
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					for (int j = 1; j <= n; j++) {
						System.out.print(j + " ");
					}
				} else {
					for (int j = n; j > 0; j--) {
						System.out.print(j + " ");
					}
				}
				System.out.println();
			}
			break;

		case 3:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(j * i + " ");
				}
				System.out.println();
			}
			break;
		}
	}
}