package q8958;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String words = sc.next();
		char word[][] = new char[80][2];
		for (int i = 0; i<words.length(); i++) {
			word[i][2] = words.charAt(i);
			System.out.print(word[i][2] + " ");
		}
		sc.close();
		System.out.println();
		
		boolean O = true;
		boolean X = false;
		
		
	}
}
