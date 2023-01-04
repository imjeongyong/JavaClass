package string;

import java.util.Scanner;

public class Q9117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		char[] charAr = new char[str.length()];
		for (int i = 0; i < charAr.length; i++) {
			for (int j = 0, k = i + 1; j < charAr.length; j++, k++) {
				if (k == charAr.length) {
					k = 0;
				}
				charAr[k] = str.charAt(k);
				System.out.print(charAr[k]);
			}
			System.out.println();
		}
	}
}