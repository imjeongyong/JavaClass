package OOP1;

public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 };
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) { // 메서드 오버로딩 <- 메서드 이름은 같지만 파라메터 형태와 종류가 다름!
		result[0] = a + b;
	}
}