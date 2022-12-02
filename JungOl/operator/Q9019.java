package operator;

import java.util.Scanner;

public class Q9019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		a = a + 3;
		b = b - 3;
		c = c * 3;
		d = d / 3;
		e = e % 3;

		System.out.println(a + " " + b + " " + c + " " + d + " " + e);
	}
}