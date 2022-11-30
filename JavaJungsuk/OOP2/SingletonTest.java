package OOP2;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}

class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); // private 으로 접근 제한, 인스턴스 생성 불가
		Singleton s1 = Singleton.getInstance(); // static 메서드 인스턴스 생성 없이 메서드 호출 가능, get메서드를 통해 private 인스턴스 생성
		Singleton s2 = Singleton.getInstance(); // s1과 같은 주소값
	}
}