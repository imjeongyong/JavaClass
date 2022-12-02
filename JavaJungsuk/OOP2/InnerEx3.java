package OOP2;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}

	static class StaticInner {
//		int siv = outerIv; // 인스턴스 클래스의 인스턴스 변수이기때문에 인스턴스 생성후 사용가능
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0; // <- final 생략
		final int LV = 0;

		class LocalInner { // 지역클래스
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
}