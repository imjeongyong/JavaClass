package debugging;

import java.util.Scanner;

public class Q9027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double inp1 = sc.nextDouble();
		double inp2 = sc.nextDouble();
		sc.close();

		int res1 = (int)(inp1 + inp2); // 더하고 타입캐스팅
		int res2 = (int) inp1 + (int) inp2; // 타입캐스팅 후 더하기
		System.out.print(res1 + " " + res2); // 출력
	}
}