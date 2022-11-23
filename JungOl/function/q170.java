package function;

import java.util.Scanner;

public class q170 {

	void atSign() {
		System.out.println("@@@@@@@@@@");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		q170 m = new q170();
		System.out.println("first");
		m.atSign();
		System.out.println("second");
		m.atSign();
		System.out.println("third");
		m.atSign();
	}
}