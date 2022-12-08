package array1;

import java.util.Scanner;

public class Q9067 {
	public static void main(String[] args) {
		int[] ar = new int[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
//			System.out.print(ar[i] + " ");
		}
		sc.close();

		System.out.print(ar[2] + " " + ar[4] + " " + ar[9]);
	}
}