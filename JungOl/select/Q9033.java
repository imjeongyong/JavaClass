package select;

import java.util.Scanner;

public class Q9033 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int sco = sc.nextInt();
		sc.close();

		if (sco >= 90) {
			System.out.println("A");
		} else if (sco >= 80) {
			System.out.println("B");
		} else if (sco >= 70) {
			System.out.println("C");
		} else if (sco >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}