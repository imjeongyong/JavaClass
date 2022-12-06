package operator;

import java.util.Scanner;

public class Q9023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int output = (a == b) ? 1 : 0;
		System.out.print(output + " ");

		output = (b == c) ? 1 : 0;
		System.out.print(output + " ");

		output = (a != b) ? 1 : 0;
		System.out.print(output + " ");
		
		output = (b != c) ? 1 : 0;
		System.out.print(output + " ");
	}
}