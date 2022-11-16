package q8958;

import java.util.Scanner;

public class Main_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String words;
		char word[] = new char[80];
		for (int i = 0; i < word.length; i++) {
			words = sc.next();
			if (words != "O" && words != "X") {
				continue;
			}
			word[i] = words.charAt(i);
//			System.out.print(word[i] + " ");
		}
		sc.close();
		System.out.println();

		int sum = 0;
		int add = 0;
		for (int i = 0; i < word.length; i++) {
			if (word[i] == 'O') {
				sum += ++add;
			} else if (word[i] == 'X') {
				add = 0;
			}
		}
		System.out.print(sum + " ");
	}
}
