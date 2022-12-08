package array1;

public class Q9066 {
	public static void main(String[] args) {
		char[] charAr = new char[26];

		char c = 'A';
		for (int i = 0; i < charAr.length; i++) {
			charAr[i] = c++;
//			System.out.print(charAr[i]+ " ");
		}
		for (int i = charAr.length - 1; i >= 0; i--) {
			System.out.print(charAr[i] + " ");
		}
	}
}