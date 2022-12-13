package debugging;

import java.util.Scanner;

public class Q116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int sco = 0;
		for (int i = 0; i < 3; i++) {
			sco = sc.nextInt();
			sum += sco;
		}
		sc.close();
		System.out.printf("%.1f", (double)sum / 3);
	}
}