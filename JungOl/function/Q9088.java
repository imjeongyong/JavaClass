package function;

import java.util.Scanner;

public class Q9088 {

	static void print(int n1, char op, int n2) {
		switch (op) {
		case '+':
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case '-':
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case '*':
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case '/':
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		default:
			System.out.println("0");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int n2 = sc.nextInt();
		sc.close();

		print(n1, op, n2);
	}
}