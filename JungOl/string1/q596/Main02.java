package q596;

import java.util.Scanner;

public class Main02 {
	static String words;
	static int num;

	void lineUp(String words) {
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
		Main02 prism = new Main02();

		words = sc.next();
		num = sc.nextInt();
		sc.close();

		prism.lineUp(words);
	}
}
// input = korea 3
// output = aer