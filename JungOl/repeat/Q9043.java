package repeat;

import java.util.Scanner;

public class Q9043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = 0;
		int sum = 0;
		int i = 0;
		while (true) {
			inp = sc.nextInt();
			if (inp % 2 != 0) {
				i++;
				sum += inp;
			} else if (inp == 0) {
				break;
			}
		}
		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 = " + sum / i);
	}
}