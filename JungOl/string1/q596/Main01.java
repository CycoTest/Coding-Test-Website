package q596;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.next();
		int num = sc.nextInt();
		sc.close();

		char W[] = new char[words.length()];
		for (int i = 0; i < words.length(); i++) {
			W[i] = words.charAt(i);
//			System.out.print(W[i]);
		}
//		System.out.println();

		char rW[] = new char[words.length()];
		for (int i = 0; i < words.length(); i++) {
			rW[i] = W[words.length() - 1 - i];
//			System.out.print(rW[i]);
		}
//		System.out.println();

		if (num <= words.length()) {
			for (int i = 0; i < num; i++) {
				System.out.print(rW[i]);
			}
//			System.out.println();			
		} else {
			System.out.print(rW);
		}
//		Main prism = new Main();
	}
}
// input = korea, 3
// output = aer