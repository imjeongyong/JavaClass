package inPut;

import java.util.Scanner;

public class Q9014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 몇 살입니까? ");
		int N = sc.nextInt();
		sc.close();
		System.out.println("당신의 나이는 " + N + "살이군요.");
	}
}