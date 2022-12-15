package Q1193;

import java.util.Scanner;

public class Main { // 시간초과...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int counter = 0;
		for (int i = 1; i <= X; i++) {
			int num = i;
			if (i % 2 == 0) { // 짝수 열
				num = 1;
				for (int j = i; j >= 1; j--, num++) {
					counter++;
					if (counter == X) {
						System.out.print(num + "/" + j);
						break;
					}
				}
			} else { // 홀수 열
				num = i;
				for (int j = 1; j <= i; j++, num--) {
					counter++;
					if (counter == X) {
						System.out.print(num + "/" + j);
						break;
					}
				}
			}
		}
	}
}