package inPut;

import java.util.Scanner;

public class Q9015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 수를 입력하시오. ");
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		System.out.println(inp1 + " + " + inp2 + " = " + (inp1 + inp2));
		System.out.println(inp1 + " * " + inp2 + " = " + inp1 * inp2);

	}
}