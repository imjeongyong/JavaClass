package OOP1;

class Tv {
	private String color;
	private boolean power;
	int channel; // 1~100

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	int getChannel() {
		return this.channel;
	}

	void setChannel(int ch) {
		if (ch > 100 || ch < 1) {
			System.out.println("잘못된 채널입니다.");
		} else {
			channel = ch;
		}
	}

	String getColor() {
		return this.color;
	}

	void setColor(String color) {
		this.color = color;
	}

}

class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.getChannel() + "입니다.");
		System.out.println("t2의 channel값은 " + t2.getChannel() + "입니다.");

//		t1.channel = 7; // 멤버변수 직접적으로 변경 <-좋지 않은 코드(캡슐화)
		t1.setChannel(7);
		t1.setChannel(7);
		System.out.println("t1의 channel값은 " + t1.getChannel() + "입니다.");
		System.out.println("t2의 channel값은 " + t2.getChannel() + "입니다.");
	}
}
