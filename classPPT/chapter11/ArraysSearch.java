package chapter11;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88 };

		Arrays.sort(scores); // binarySearch를 하기 전에는 항상 오름차순으로 정렬!
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		int index = Arrays.binarySearch(scores, 99); // 오름차순으로 정렬하지 않으면 기능x
		System.out.println("index : " + index);
	}
}