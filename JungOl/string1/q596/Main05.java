package q596;

import java.util.Scanner;

public class Main05 {
	static String words;
	static int num;
	char rW[] = new char[words.length()];
	
	Main05() {
		char W[] = new char[words.length()];

		for (int i = 0; i < words.length(); i++) {
			W[i] = words.charAt(i);
			for (int j = 0; j < words.length(); j++) {
				this.rW[j] = W[words.length() - 1 - j];
			}
		}

	}
	void compare() {
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
		Main05 prism = new Main05();

		words = sc.next();
		num = sc.nextInt();
		sc.close();

		prism.compare();
	}
}
// input = korea 3
// output = aer