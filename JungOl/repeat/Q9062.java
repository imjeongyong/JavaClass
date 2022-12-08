package repeat;

public class Q9062 {
	public static void main(String[] args) {

		int c = 97;
		int n = 1;
		int k = 4;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%c ", c++);
			}
			for (int j = 1; j <= k; j++) {
				System.out.print(n++ + " ");
			}
			k--;
			System.out.println();
		}
	}
}