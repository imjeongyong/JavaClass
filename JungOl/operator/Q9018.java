package operator;

import java.util.Scanner;

public class Q9018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("두 개의 수를 입력하시오. ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
	}
}