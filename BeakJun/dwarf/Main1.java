package dwarf;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[9];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += ar[i];
		}

		int a = 0;
		int b = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i != j && sum - (ar[i] + ar[j]) == 100) {
					a = i;
					b = j;
					break;
				}
			}
		}
		for (int k = 0; k < ar.length; k++) {
			if (k != a && k != b) {
				System.out.println(ar[k]);
			}
		}
	}
}