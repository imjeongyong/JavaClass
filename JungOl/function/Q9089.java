package function;

import java.util.Scanner;

public class Q9089 {

	void firfunc(int n1, int n2) {
		int x = n1;
		int y = n2;
		int tmp = n1;
		x = n2;
		y = tmp;
		System.out.print("첫 번째 함수 실행중 x = " + x + ", y = " + y);
		System.out.println();
		int a = x;
		int b = y;
		tmp = a;
		a = b;
		b = tmp;
		System.out.print("첫 번째 함수 실행후 a = " + a + ", b = " + b);
		System.out.println();
	}

	void secfunc(int n1, int n2) {
		int x = n1;
		int y = n2;
		int tmp = n1;
		x = n2;
		y = tmp;
		System.out.print("두 번째 함수 실행중 x = " + x + ", y = " + y);
		System.out.println();
		int a = x;
		int b = y;
		System.out.print("두 번째 함수 실행후 a = " + a + ", b = " + b);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요. ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Q9089 m = new Q9089();
		m.firfunc(n1, n2);
		m.secfunc(n1, n2);
	}
}