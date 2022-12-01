package select;

import java.util.Scanner;

public class q124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		switch (inp) {
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("31");
			break;
		}
	}
}