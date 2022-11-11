package q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 비만수치 = 몸무게+100-키
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		
		int eq = weight + 100 - height;
		
		System.out.println(eq);
		
		if (eq > 0) {
			System.out.print("Obesity");
		}
	}
}
