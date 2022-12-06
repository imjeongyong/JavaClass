package repeat;

import java.util.Scanner;

public class Q9052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int scor = 0;

		for (int i = 0; i < 5; i++) {
			scor = sc.nextInt();
			sum += scor;
		}
		sc.close();
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f", (double) sum / 5);
	}
}