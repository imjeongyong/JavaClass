package Q1193;

import java.util.Scanner;

public class Main { // for문은 시간초과... whil문으로 바꾸니까 통과됨!!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int counter = 0;
		boolean b = true;
		int i = 0;
		while(b) {
			i++;
			int num = i;
			if (i % 2 == 0) { // 짝수 열
				num = 1;
				for (int j = i; j >= 1; j--, num++) {
					counter++;
					if (counter == X) {
						System.out.print(num + "/" + j);
						b=!b;
					}
				}
			} else { // 홀수 열
				num = i;
				for (int j = 1; j <= i; j++, num--) {
					counter++;
					if (counter == X) {
						System.out.print(num + "/" + j);
						b=!b;
					}
				}
			}
		}
	}
}