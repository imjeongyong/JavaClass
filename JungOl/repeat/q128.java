package repeat;

import java.util.Scanner;

public class q128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = false;
		int counter = 0;
		do {
			int inp = sc.nextInt();
			if (inp == 0) {
				sc.close();
				b = true;
			} else if (inp % 3 != 0 && inp % 5 != 0) {
				counter++;
			}
		} while (!b);
		System.out.print(counter);
	}
}