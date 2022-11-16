package q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avgClass[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int sum = 0;
		for (int i=sc.nextInt();;) {
			sum += avgClass[i];
			sc.close();
			System.out.println(sum);
		}
	}
}