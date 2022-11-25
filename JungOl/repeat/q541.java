package repeat;

import java.util.Scanner;

public class q541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		for (int i = 0; i < 20; i++) {
			System.out.print(c);
		}
	}
}