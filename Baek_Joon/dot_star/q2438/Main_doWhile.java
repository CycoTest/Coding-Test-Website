package q2438;

import java.util.Scanner;

public class Main_doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();

//		System.out.println(count);
		
//		for (int frequency = 0; frequency <= count; frequency++) {
//			for (int times = 1; times <= frequency; times++) {
//				System.out.print('*'); 
//			}
//			System.out.println();
//		}

		int frequency = 0;
		do {
			int times = 0;
			do {
				System.out.print("*");
				times++;
			} while (times <= frequency);
			frequency++;
			System.out.println();
		} while (frequency < count);
	}
}
