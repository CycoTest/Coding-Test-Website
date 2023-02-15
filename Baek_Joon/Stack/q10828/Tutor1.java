package q10828;

import java.util.Scanner;

class MyStack {
	private int[] ar;
	private int mTop;

	public MyStack() {
		ar = new int[10000];
		mTop = -1;
	}

	public void push(int p) {
		ar[++mTop] = p;
	}

	public void pop() {
		if (mTop == -1) {
			System.out.println(mTop);
		} else {
			System.out.println(ar[mTop--]);
		}
	}

	public void top() {
		if (mTop == -1) {
			System.out.println(mTop);
		} else {
			System.out.println(ar[mTop]);
		}
	}

	public void size() {
		System.out.println(mTop + 1);
	}

	public void empty() {
		if (mTop == -1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}

public class Tutor1 {
	public static void main(String[] args) {
		MyStack stk = new MyStack();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			String cmd = in.next();

			switch (cmd) {
			case "push":
				int p = in.nextInt();
				stk.push(p);
				break;

			case "pop":
				stk.pop();
				break;

			case "size":
				stk.size();
				break;

			case "empty":
				stk.empty();
				break;

			case "top":
				stk.top();
				break;
			}
		}
		in.close();

	}
}
