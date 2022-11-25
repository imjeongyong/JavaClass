package function2;

import java.util.Scanner;

public class q579 {

	static void dscOrder(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length - 1; j++) {
				if (ar[j] < ar[j + 1]) {
					int tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		q579.dscOrder(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}