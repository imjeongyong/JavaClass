package repeat;

import java.util.Scanner;

public class Q9055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int i = 0;
		int sum = 0;
		do {
			sum += i++;
		} while (sum <= N);
		System.out.print(i-1+" ");
		System.out.println(sum);
	}
}