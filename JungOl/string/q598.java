package string;

import java.util.Scanner;

public class q598 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		do {
			char c = sc.next().charAt(0);
			if ((c >= 65 && c <= 90) || c >= 97 && c <= 122) {
				System.out.println(c);
			} else if (c >= 48 && c <= 57) {
				System.out.println((int) c);
			} else {
				sc.close();
				b = false;
			}
		} while (b);
	}
}