package q596;

import java.util.Scanner;

public class Main04 {
	static String words;
	static int num;

	Main04() {
		char W[] = new char[words.length()];
		char rW[] = new char[words.length()];

		for (int i = 0; i < words.length(); i++) {
			W[i] = words.charAt(i);
			for (int j = 0; j < words.length(); j++) {
				rW[j] = W[words.length() - 1 - j];
			}
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
		Main04 prism = new Main04();

		words = sc.next();
		num = sc.nextInt();
		sc.close();

		System.out.print(prism);
	}
}
// input = korea 3
// output = aer