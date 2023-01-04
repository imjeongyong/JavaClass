package string;

import java.util.Scanner;

public class Q600 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

//		System.out.println(str);
		String[] strAr = str.split(" ");
		System.out.println(strAr.length);
	}
}