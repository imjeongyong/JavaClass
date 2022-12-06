package select;

import java.util.Scanner;

public class Q9031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println("입력받은 수 중 큰 수는 " + Math.max(n1, n2) + "이고 작은 수는 " + Math.min(n1, n2) + "입니다.");
	}
}