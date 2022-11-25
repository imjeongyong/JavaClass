package OOP2;

class Data3 {
	int value;
}

class Data4 {
	int value;

	Data4(int x) {
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data3 d3 = new Data3();
//		Data4 d4 = new Data4(); // <- 컴파일 오류 발생, 생성자 파라메터 정의 x

		Data4 d4 = new Data4(5);
	}
}
