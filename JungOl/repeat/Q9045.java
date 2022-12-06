package repeat;

import java.util.Scanner;

public class Q9045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = 0;
		while (inp != 4) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요. ");
			inp = sc.nextInt();
			System.out.println();

			switch (inp) {
			case 1:
				System.out.println("입력하기를 선택하였습니다.");
				System.out.println();
				break;
			case 2:
				System.out.println("출력하기를 선택하였습니다.");
				System.out.println();
				break;
			case 3:
				System.out.println("삭제하기를 선택하였습니다.");
				System.out.println();
				break;
			case 4:
				System.out.println("끝내기를 선택하였습니다.");
				System.out.println();
				sc.close();
				break;
			default:
				System.out.println("잘못 선택하였습니다.");
				System.out.println();
				break;
			}
		}
	}
}