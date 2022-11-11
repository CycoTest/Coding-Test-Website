package q535;

import java.util.Scanner;

public class Main_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();
		
		switch ((int)score) {
		case 4:
			if (score >= 4) {
				System.out.println("scholarship");
			}
			break;
		case 3:
			if (score >= 3) {
				System.out.println("next semester");
			}
			break;
		case 2:
			if (score >= 2) {
				System.out.println("seasonal semester");
			}
			break;
		default:
			System.out.println("retake");
		}	
	}
}
