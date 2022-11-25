package OOP2;

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class VCR {
	boolean power;
	int counter = 0;

	void power() {
		power = !power;
	}

	void play() {
	}

	void stop() {
	}

	void rew() {
	}

	void ff() {
	}
}

class TVCR extends Tv {
	VCR vcr = new VCR();

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	}

	void rew() {
		vcr.rew();
	}

	void ff() {
		vcr.ff();
	}
}

class TVCRTest {
	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		System.out.println(tvcr.power);
		tvcr.power();
		System.out.println(tvcr.power);

		tvcr.play();
		tvcr.stop();
		tvcr.channel = 12;
		tvcr.channelUp();
		System.out.println(tvcr.channel);
	}
}