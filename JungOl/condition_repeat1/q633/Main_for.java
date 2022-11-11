package q633;

import java.util.Scanner;

public class Main_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.print("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China\n" + "number? \n");
			int num = sc.nextInt();
			
			if (num == 1) {
				System.out.println("Seoul");
			} else if (num == 2) {
				System.out.println("Washington");
			} else if (num == 3) {
				System.out.println("Tokyo");
			} else if (num == 4) {
				System.out.println("Beijing");
			} else {
				System.out.println("none");
				sc.close();
				break;
			}
		}
	}
}
