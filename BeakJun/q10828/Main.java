package q10828;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// stack 문제

class StackStack {
	List<Integer> stack;

	StackStack() {
		stack = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i <= N; i++) {
			String inp = sc.nextLine();
			switch (inp) {
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "top":
				top();
				break;
			default:
				break;
			}
		}
		sc.close();

	}

	void push() {
		System.out.println("push");
	}

	void pop() {
		System.out.println("pop");
		int lastIndx = stack.size() - 1;
		System.out.println(stack.get(lastIndx));
		stack.remove(lastIndx);
	}

	void size() {
		System.out.println(stack.size());
	}

	void empty() {
		if (stack.isEmpty()) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	void top() {
		int lastIndx = stack.size() - 1;
		System.out.println(stack.get(lastIndx));

	}
}

public class Main {
	public static void main(String[] args) {
		new StackStack();
	}
}