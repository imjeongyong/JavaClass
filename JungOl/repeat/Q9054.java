package repeat;

public class Q9054 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.printf("%d * %d = %2d   ", j, i, j * i);
			}
			System.out.println();
		}
	}
}