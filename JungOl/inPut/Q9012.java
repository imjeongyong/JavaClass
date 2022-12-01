package inPut;

public class Q9012 {
	public static void main(String[] args) {
		int r = 5;
		double pi = 3.140000;
		double l = r * 2 * pi;
		double s = r * r * pi;

		System.out.printf("원주 = %d * 2 * %f = %f\n", r, pi, l);
		System.out.printf("넓이 = %d * %d * %f = %f\n", r, r, pi, s);
	}
}