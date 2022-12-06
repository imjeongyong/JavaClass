package select;

import java.util.Scanner;

public class Q9032 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		if (inp >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		}
	}
}