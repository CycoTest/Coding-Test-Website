package q633;

import java.util.Scanner;

public class Main_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("1. Korean");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("Seoul");
			} else if (num == 2) {
				System.out.println("Washington");
			} else if (num == 3) {
				System.out.println("Tokyo");
			} else if (num == 4) {
				System.out.println("Beijing");
			} 
		} while (1 <= num && num <= 4);
		sc.close();
		System.out.println("none");
	}
}
