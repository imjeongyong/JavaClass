package repeat;

import java.util.Scanner;

public class Q129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		do {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.printf("Triangle width = %.1f\n", (base * height) / (double) 2);
			System.out.print("Continue? ");
			char anw = sc.next().charAt(0);
			if (!(anw == 'y' || anw == 'Y')) {
				b = !b;
			}
		} while (!b);
		sc.close();
	}
}