package structure;

import java.util.Scanner;

class Triangle {
	private Coordinate[] tri;
	Scanner sc = new Scanner(System.in);

	Triangle() {
		tri = new Coordinate[3];
		for (int i = 0; i < tri.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			tri[i] = new Coordinate(x, y);
		}
	}

	void gPrint() {
		double gX = 0;
		double gY = 0;
		for (int i = 0; i < tri.length; i++) {
			gX += tri[i].getX();
			gY += tri[i].getY();
		}

		System.out.printf("(%.1f, %.1f)", gX / 3, gY / 3);
	}
}

class Coordinate {
	private int x;
	private int y;

	Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class q616 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.gPrint();
	}
}