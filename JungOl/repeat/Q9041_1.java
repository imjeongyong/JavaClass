package repeat;

import java.util.Scanner;

public class Q9041_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = 0;
		do {
			System.out.print("점수를 입력하세요. ");
			score = sc.nextInt();
			if (score >= 80 && score <= 100) {
				System.out.println("축하합니다. 합격입니다.");
			} else if (score >= 0 && score < 80) {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		} while (score >= 0 && score <= 100);
		sc.close();
	}
}