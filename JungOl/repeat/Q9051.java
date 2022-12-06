package repeat;

import java.util.Scanner;

public class Q9051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = 0;
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			inp = sc.nextInt();
			if (inp % 2 == 0) {
				counter++;
			}
		}
		sc.close();
		System.out.println("입력받은 짝수는 " + counter + "개입니다.");
	}
}