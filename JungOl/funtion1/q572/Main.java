package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = 0; // r : 반지름, radius
		r = sc.nextInt();
		sc.close();
		
		float PI = 3.14f;
		float w = r*r*PI; // w : 넓이, width
		
		System.out.printf("%.2f", w);
	}
}
