package repeat;

public class Q9059 {
	public static void main(String[] args) {
		int k = 5;
		int l = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < k; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= l; j++) {
				System.out.print("*");
			}
			k--;
			l += 2;
			System.out.println();
		}
	}
}