package string;

import java.util.Scanner;

public class Q601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0, k = str.length() - 1; j < str.length(); j++, k++) {
				if (k >= str.length()) {
					k = k - str.length();
				}
				char c = str.charAt(k);
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}