package chapter11;

public class WrapperAutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		Integer obj = 100; // 자동 Boxing(인스턴스변수에 기본타입변수를 타입캐스팅없이 대입
		System.out.println("value : " + obj.intValue());

		int value = obj; // 자동 UnBoxing(까꾸루 기본타입변수에 인스턴스 변수를 대입도 가능
		System.out.println("value : " + value);

		int result = obj + 100; // 자동 UnBoxing(연산도 가능
		System.out.println("result : " + result);
	}
}