package operator;

import java.util.Scanner;

public class Q112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.printf("%d / %d = %d...%d\n", inp1, inp2, inp1 / inp2, inp1 % inp2);
	}
}