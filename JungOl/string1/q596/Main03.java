package q596;

import java.util.Scanner;

public class Main03 {
	static String words;
	static int num;

	Main03() {
		char W[] = new char[words.length()];
		for (int i = 0; i < words.length(); i++) {
			W[i] = words.charAt(i);
		}

		char rW[] = new char[words.length()];
		for (int i = 0; i < words.length(); i++) {
			rW[i] = W[words.length() - 1 - i];
		}

		if (num <= words.length()) {
			for (int i = 0; i < num; i++) {
				System.out.print(rW[i]);
			}
		} else {
			System.out.print(rW);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main03 prism = new Main03();

		words = sc.next();
		num = sc.nextInt();
		sc.close();

		System.out.print(prism);
	}
}
// input = korea 3
// output = aer