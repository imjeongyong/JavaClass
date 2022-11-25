package OOP1;

public class PowerTest {
	public static void main(String[] args) { // 재귀함수
		int x = 2;
		int n = 5;
		long result = 0;

		for (int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		System.out.println(result);
		System.out.println("----------------------------");

		int res1 = 0;
		for (int i = 0; i < 5; i++) {
			int num = 1;
			for (int j = 0; j <= i; j++) {
				num *=n;
			}
		}
		System.out.println(res1);
		System.out.println("----------------------------");

		int res2 = 0; // Math.pow 클래스 이용!
		for (int i = 0; i < 5; i++) {
			res2 += Math.pow(x, i + 1);
		}
		System.out.println(res2);

		System.out.println("----------------------------");

	}

	static long power(int x, int n) {
		if (n == 1)
			return x;
		return x * power(x, n - 1);
	}
}