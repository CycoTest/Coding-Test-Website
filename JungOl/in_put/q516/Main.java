package q516;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		String w1 = sc.next();
		sc.close();
		
		System.out.printf("%.2f\n", n1);
		System.out.printf("%.2f\n", n2);
		System.out.print(w1);		
	}
}
