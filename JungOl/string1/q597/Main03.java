package q597;

import java.util.Scanner;

public class Main03 {
	String w1;
	String w2;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		w1 = sc.next();
		w2 = sc.next();
		sc.close();

		int sum = w1.length() + w2.length();
		System.out.println(sum);		
	}
	
	public static void main(String[] args) {
		Main03 length = new Main03();
		
		length.input();
	}
}
