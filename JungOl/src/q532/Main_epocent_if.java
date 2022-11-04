package q532;

import java.util.Scanner;

public class Main_epocent_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		sc.close();
		
		System.out.println(d1);
		System.out.println(d2);
		
		if (d1 >= 4.0 && d2 >= 4.0) {
		// && : condition이 2개 이상 붙을 때 사용하는 논리합
			System.out.println("A");
		} else if (d1 >= 3.0 && d2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
