package function;

import java.util.Scanner;

public class Q9086 {

	static void avgPrint(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		System.out.printf("평균 : %.2f", (double) sum / 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("세과목의 점수를 입력하세요. ");
		int sco1 = sc.nextInt();
		int sco2 = sc.nextInt();
		int sco3 = sc.nextInt();
		sc.close();

		avgPrint(sco1, sco2, sco3);
	}
}