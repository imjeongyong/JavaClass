package string;

import java.util.Scanner;

public class Q9116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String[] str1 = str.split(" ");
		for(String print : str1) {
			System.out.println(print);
		}
//		System.out.println(str);
	}
}