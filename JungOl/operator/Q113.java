package operator;

import java.util.Scanner;

public class Q113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int length = sc.nextInt();
		sc.close();

		width = width + 5;
		length = length * 2;

		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + width * length);
	}
}