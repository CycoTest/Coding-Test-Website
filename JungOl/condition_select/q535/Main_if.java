package q535;

import java.util.Scanner;

public class Main_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();
		
		if (score >= 4.0) {
			System.out.println("scholarship");
		} else if (score >= 3.0) {
			System.out.println("next semester");
		} else if (score >= 2.0) {
			System.out.println("seasonal semester");
		} else {
			System.out.println("retake");
		}
	}
}
