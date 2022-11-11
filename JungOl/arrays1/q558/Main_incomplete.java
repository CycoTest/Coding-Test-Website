package q558;

import java.util.Scanner;

public class Main_incomplete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[100];
		int[] reverseArr = new int[100];
		
		for (int i=0; i<num.length; i++) {
			int rg = sc.nextInt();
			num[i] = rg;
//			num[i] = sc.nextInt();
			
			if (rg == 0) {
				for (int j=(num.length-1); 0<= j && j<(num.length-1); j++ ) {
					reverseArr[j]= num[i];
					System.out.print(reverseArr[j]);
				}
			} else {
				break;
			}
		}
		sc.close();
	}
}
/*
 * 
 * 
 * 
 */
