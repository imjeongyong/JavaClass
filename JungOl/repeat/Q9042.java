package repeat;

import java.util.Scanner;

public class Q9042 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		int inp = 0;
		int sum = 0;
		do {
			inp = sc.nextInt();
			sum += inp;
			i++;
		} while (inp != 0);
		sc.close();
		System.out.println("입력된 자료의 개수 = " + (i - 1));
		System.out.println("입력된 자료의 합계 = " + sum);
		System.out.printf("입력된 자료의 평균 = %.2f", (double) sum / (i - 1));
	}
}