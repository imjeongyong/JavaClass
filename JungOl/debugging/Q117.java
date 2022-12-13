package debugging;

import java.util.Scanner;

public class Q117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double sco = 0.0;
		double sum = 0.0;
		for (int i = 0; i < 3; i++) {
			sco = sc.nextDouble();
			sum += sco;
		}

		System.out.printf("sum %d\n", sum);
//		System.out.printf("avg %d", sum / 3);
	}
}