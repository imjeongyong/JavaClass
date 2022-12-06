package function;

import java.util.Scanner;

public class Q9090 {

	static void plMul(int n1, int n2) {
		System.out.println("합 : " + (n1 + n2));
		System.out.println("곱 : " + (n1 * n2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		plMul(n1, n2);
	}
}