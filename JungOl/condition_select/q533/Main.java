package q533;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();
		
		switch (gender) {
		case 'M':
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
			break;
		case 'F':
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
			break;
		}
	}
}
