/*
package function;
 

import java.util.Scanner;

public class q578 {

	void nnd(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.printf("== %ddan ==\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		int big = 0;
		int small = 0;
		if (inp1 > inp2) {
			big = inp1;
			small = inp2;
		} else {
			big = inp2;
			small = inp1;
		}

		q578 nineninedan = new q578();
		nineninedan.nnd(small, big);
	}
}

*/

package function;

import java.util.Scanner;

public class q578 {

	void nndPrint(int n1, int n2) {
		int small = 0;
		int big = 0;
		if (n1 > n2) {
			small = n2;
			big = n1;
		} else if (n1 < n2) {
			small = n1;
			big = n2;
		}

		for (int i = small; i <= big; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		q578 nnd = new q578();
		nnd.nndPrint(n1, n2);
	}
}