package OOP2;

class Card1 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card1(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}

	Card1() {
		this("HEART", 1);
	}

	public String toString() {
		return KIND + " " + NUMBER;
	}
}

class FinalCardTest {
	public static void main(String[] args) {
		Card1 c = new Card1("HEART", 10);
//		c.NUMBER = 5; // <- final (상수 선언) 초기화 불가, 상수는 선언과 동시에 초기화 또는 생성자로 초기화
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // <- c.toString() 을 자동으로 호출, 해당 객체의 내용을 문자열형태로 출력, println 메서드의 오버로딩
	}
}