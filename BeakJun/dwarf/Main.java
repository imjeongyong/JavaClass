package dwarf;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[9];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}

		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

//		System.out.println(sum);

		loop1: for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				int spy = 0;
				spy = ar[i] + ar[j];
				if (i != j && sum - spy == 100) {
					for (int k = 0; k < ar.length; k++) {
						if (k != i && k != j) {
							System.out.println(ar[k]);
						}
					}
					break loop1;
				}
			}
		}
	}
}