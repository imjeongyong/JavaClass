package chapter11;

import java.text.DecimalFormat;

public class DecimalFormatEx {
	public static void main(String[] args) {
		double num = 1234567.89;

		DecimalFormat df = new DecimalFormat("0"); // 정수자리, 반올림
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0"); // 소수점1자리까지
		System.out.println(df.format(num));

		df = new DecimalFormat("0000000000.00000"); // 자릿수 세팅
		System.out.println(df.format(num));

		df = new DecimalFormat("#"); // 10진수
		System.out.println(df.format(num));

		df = new DecimalFormat("###########.#####"); // 10진수 자릿수
		System.out.println(df.format(num));

		df = new DecimalFormat("#.0"); // 10진수 소숫점 1자리까지
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0"); // 부호
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0"); // 부호
		System.out.println(df.format(num));

		df = new DecimalFormat("#, ###.0"); // 3자리마다 ,
		System.out.println(df.format(num));

		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));

		df = new DecimalFormat("+#,###;-#.###");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));

		df = new DecimalFormat("\u00A4 #.###");
		System.out.println(df.format(num));
	}
}