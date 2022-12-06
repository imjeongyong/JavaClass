package function;

import java.util.Scanner;

public class Q9083 {

	static void func(int inp) {
		System.out.println("10큰수 : " + (inp + 10));
		System.out.println("10작은수 : " + (inp - 10));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		func(inp);
	}
}