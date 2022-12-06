package select;

import java.util.Scanner;

public class Q9034 {
	public static void main(String[] args) {
		System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		sc.close();

		if (d1 >= 4 && d2 >= 4) {
			System.out.println("이겼습니다.");
		} else if (d1 >= 4 || d2 >= 4) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
	}
}