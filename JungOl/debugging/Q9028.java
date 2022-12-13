package debugging;

import java.util.Scanner;

public class Q9028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.printf("%d / 4 = %d\n", inp, inp / 4); // 정수 / 정수 = 정수
		System.out.printf("%d / 4.0 = %.2f", inp, inp / 4.0); // 정수 /실수 = 실수
	}
}