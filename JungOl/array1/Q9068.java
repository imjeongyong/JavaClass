package array1;

import java.util.Scanner;

public class Q9068 {
	public static void main(String[] args) {
		int[] ar = new int[100];
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i < ar.length) {
			ar[i] = sc.nextInt();
			if (ar[i] == 0) {
				sc.close();
				break;
			}
			i++;
		}

		for (i = 1; i < ar.length; i += 2) {
			if (ar[i] == 0) {
				break;
			}
			System.out.print(ar[i] + " ");
		}
	}
}