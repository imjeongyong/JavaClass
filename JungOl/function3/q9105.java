package function3;

import java.util.Scanner;

public class q9105 {

	static void dice(int N) {
		for(int i = 1; i<=6; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		dice(N);
	}
}