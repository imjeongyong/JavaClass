package array1;

import java.util.Scanner;

public class Q9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}