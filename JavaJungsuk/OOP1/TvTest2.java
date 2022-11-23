package OOP1;

class Tv {
	String color;
	boolean power;
	private int channel;

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
		channel = ch;
	}
}

class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.getChannel() + "입니다.");
		System.out.println("t2의 channel값은 " + t2.getChannel() + "입니다.");

//		t1.channel = 7; // 멤버변수 직접적으로 변경 <-좋지 않은 코드
		t1.setChannel(7);
		System.out.println("t1의 channel값은 " + t1.getChannel() + "입니다.");
		System.out.println("t2의 channel값은 " + t2.getChannel() + "입니다.");
	}
}
