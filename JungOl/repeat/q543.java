package repeat;

import java.util.Scanner;

public class q543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 2; i <= N; i += 2) {
			System.out.print(i + " ");
		}
	}
}