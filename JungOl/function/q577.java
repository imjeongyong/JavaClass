package function;

import java.util.Scanner;

public class q577 {

	void cal(int a, int b) {
		if (a > b) {
			a = a / 2;
			b = b * 2;
		} else if (a < b) {
			a = a * 2;
			b = b / 2;
		}
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		q577 m = new q577();
		m.cal(n1, n2);
	}
}