package select;

import java.util.Scanner;

public class Q9035 {
	public static void main(String[] args) {
		System.out.print("세 수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int max = 0;
		max = Math.max(a, b);
		max = Math.max(max, c);

		System.out.println("입력받은 수 중 가장 큰 수는 " + max + "입니다.");
	}
}