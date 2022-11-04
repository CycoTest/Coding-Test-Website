package compare_if;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int regulNum1 = sc.nextInt();
		int regulNum2 = sc.nextInt();
		int regulNum3 = sc.nextInt();
		sc.close();
		
//		System.out.println(regulNum1 + " " + regulNum2 + " " + regulNum3);

		if (regulNum1 > regulNum2) {
			if (regulNum2 > regulNum3) {
				System.out.println(regulNum3);
			} else {
				System.out.println(regulNum2);
			}
		} else {
			if (regulNum2 > regulNum3) {
				System.out.println(regulNum3);
			} else {
				System.out.println(regulNum2);
			}
		}
	}
}
