package function;

import java.util.Scanner;

public class Q9085 {

	static void plMa(int n1, int n2) {
		System.out.println("두 수의 합 = " + (n1 + n2));
		System.out.println("두 수의 차 = " + Math.abs(n1 - n2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		plMa(n1, n2);
	}
}