package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		sc.close();
		
		if (d1 >= 4.0) {
			if (d2 >= 4.0) {
				System.out.println("A");
			} else if (d2 >= 3.0) {
				System.out.println("B");	
			} else {
				System.out.println("C");
			}
		} else if (d1 >= 3.0) {
			if (d2 >= 3.0) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		} else {
			if (d2 < 3.0) {
				System.out.println("C");
			}
		}
	}
}
