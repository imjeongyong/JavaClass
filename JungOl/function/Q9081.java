package function;

public class Q9081 {

	static void lineMeth() {
		for (int i = 0; i < 30; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		lineMeth();
		System.out.println("line 함수를 호출하였습니다.");
		System.out.println("line 함수를 다시 호출합니다.");
		lineMeth();
	}
}