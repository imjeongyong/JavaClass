package operator;

import java.util.Scanner;

public class Q9022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int c = ++a + b--;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
}