package OOP2;

public class CastingTest1 {
	public static void main(String[] args) {
		Car1 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;
//		car.water(); // 자식클래스에서 선언한 water 메서드 사용 불가(부모클래스에서 선언한 메서드만 호출 가능)
		fe2 = (FireEngine) car; // 명시적 타입캐스팅
		fe2.water();
	}
}

class Car1 {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car1 {
	void water() {
		System.out.println("water!!!");
	}
}