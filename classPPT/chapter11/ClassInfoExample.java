package chapter11;

public class ClassInfoExample {
	public static void main(String[] args) {
		Car car = new Car(100);
		Class clazz = car.getClass();
		System.out.println(clazz.getName()); // 패키지이름.클래스이름
		System.out.println(clazz.getSimpleName()); // 클래스이름
		System.out.println(clazz.getPackage().getName()); // 패키지이름
	}
}

class Car {
	private int speed = 0;

	public Car(int speed) {
		this.speed = speed;
	}
}